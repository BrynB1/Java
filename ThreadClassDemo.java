// ThreadClassDemo.java
public class ThreadClassDemo {
    public static void main(String[] args) {
        int guessNum = (int) (Math.random() * 100 + 1);
        System.out.println("Chosen number: " + guessNum);

        System.out.println("Starting first GuessNumber thread...");
        Thread thread1 = new GuessNumber(guessNum);
        thread1.start();

        System.out.println("Starting second GuessNumber thread...");
        Thread thread2 = new GuessNumber(guessNum);
        thread2.start();

        System.out.println("Starting third GuessNumber thread...");
        Thread thread3 = new GuessNumber(guessNum);
        thread3.start();

        System.out.println("Starting fourth GuessNumber thread...");
        Thread thread4 = new GuessNumber(guessNum);
        thread4.start();

        try {
            // Wait for all threads to complete
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("All GuessNumber threads complete after " + Shared.totalThreadGuesses + " total guesses.");
    }
}
