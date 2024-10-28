//Bryn Bijur, s1324044
import java.util.concurrent.Semaphore;

public class SleepingBarber2 {
    private static final int NUM_CHAIRS = 30;
    private static final int NUM_CUSTOMERS = 30;
    private static final int NUM_BARBERS = 3;
    private static final int CUSTOMER_ARRIVAL_INTERVAL = 500; // in milliseconds
    private static final int HAIR_CUTTING_TIME = 2000; // in milliseconds

    private static Semaphore accessSeats = new Semaphore(NUM_CHAIRS);
    private static Semaphore barberIsBusy = new Semaphore(NUM_BARBERS);
    private static int customersServed = 0;
    private static int customersLeft = 0;

    public static void main(String[] args) {
        Barber[] barbers = new Barber[NUM_BARBERS];
        for (int i = 0; i < NUM_BARBERS; i++) {
            barbers[i] = new Barber("Barber " + (i + 1));
            barbers[i].start();
        }

        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            Customer customer = new Customer(i);
            customer.start();

            try {
                Thread.sleep(CUSTOMER_ARRIVAL_INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Barber barber : barbers) {
            try {
                barber.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Customers served: " + customersServed);
        System.out.println("Customers left: " + customersLeft);
        System.out.println("Customer arrival interval: " + CUSTOMER_ARRIVAL_INTERVAL + " ms");
        System.out.println("Hair cutting time: " + HAIR_CUTTING_TIME + " ms");
    }

    static class Barber extends Thread {
        private String name;

        Barber(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    barberIsBusy.acquire();
                    System.out.println(name + " is cutting hair.");
                    Thread.sleep(HAIR_CUTTING_TIME);
                    System.out.println(name + " finished cutting hair.");
                    accessSeats.release();
                    customersServed++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Customer extends Thread {
        private int id;

        Customer(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                accessSeats.acquire();
                System.out.println("Customer " + id + " enters the barber shop.");
                System.out.println("Customer " + id + " is waiting in the waiting room.");
                barberIsBusy.release();
            } catch (InterruptedException e) {
                System.out.println("Customer " + id + " left the shop.");
                customersLeft++;
            }
        }
    }
}