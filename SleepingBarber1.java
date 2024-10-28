import java.util.concurrent.Semaphore;

public class SleepingBarber1 {
    private static final int NUM_CHAIRS = 5;
    private static final int NUM_CUSTOMERS = 20;
    private static final int CUSTOMER_ARRIVAL_INTERVAL = 500; // in milliseconds
    private static final int HAIR_CUTTING_TIME = 2000; // in milliseconds

    private static Semaphore accessSeats = new Semaphore(NUM_CHAIRS);
    private static Semaphore barberIsBusy = new Semaphore(1);
    private static int customersServed = 0;
    private static int customersLeft = 0;

    public static void main(String[] args) {
        Barber barber = new Barber();
        barber.start();

        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            Customer customer = new Customer(i);
            customer.start();

            try {
                Thread.sleep(CUSTOMER_ARRIVAL_INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            barber.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Customers served: " + customersServed);
        System.out.println("Customers left: " + customersLeft);
        System.out.println("Customer arrival interval: " + CUSTOMER_ARRIVAL_INTERVAL + " ms");
        System.out.println("Hair cutting time: " + HAIR_CUTTING_TIME + " ms");
    }

    static class Barber extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    barberIsBusy.acquire();
                    System.out.println("Barber cutting hair.");
                    Thread.sleep(HAIR_CUTTING_TIME);
                    System.out.println("Customer getting hair cut.");
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
                System.out.println("Customer " + id + " enters barber shop.");
                System.out.println("Customer " + id + " waiting in waiting room.");
                barberIsBusy.release();
            } catch (InterruptedException e) {
                System.out.println("No more empty chairs in waiting room, Customer " + id + " leaves shop.");
                customersLeft++;
                accessSeats.release();  // Release the seat for other waiting customers
            }
        }
    }
}
