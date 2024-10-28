//Bryn Bijur, s1324044
public class ThreadClassDemo {
    public static void main(String[] args) {

        // Start GuessNumber threads:
        Thread thread1 = new GuessNumber();
        thread1.setDaemon(true); // Must daemonize threads that have while(true).
        thread1.start();

        Thread thread2 = new GuessNumber();
        thread2.setDaemon(true);
        thread2.start();

        Thread thread3 = new GuessNumber();
        thread3.setDaemon(true);
        thread3.start();

        Thread thread4 = new GuessNumber();
        thread4.setDaemon(true);
        thread4.start();

        while (true) {
            Shared.secret = (int) (Math.random() * 100 + 1);
            System.out.println("\nThe secret number is " + Shared.secret + ".\n");

            // Spin here until all threads guess correctly.
            while (Shared.numThreadsDone < 4) {
                try {
                    Thread.sleep(50); // NECESSARY
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }

            System.out.println("\nAll four threads finished guessing in " +
                    Shared.totalThreadGuesses + " guesses.");
            System.out.println("\nStarting the next round.");

            try {
                Thread.sleep(2000);
                // Reset shared vars for next round.
                Shared.semaphore.acquire();
                Shared.numThreadsDone = 0;
                Shared.totalThreadGuesses = 0;
                Shared.semaphore.release();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        } // end while

    } // end main()

} // end class
