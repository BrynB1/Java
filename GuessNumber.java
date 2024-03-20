// GuessNumber.java
public class GuessNumber extends Thread {
    private static final int MAX_NUMBER = 100;
    private int number;

    public GuessNumber(int number) {
        this.number = number;
    }

    public void run() {
        int counter = 0;
        int guess = 0;

        do {
            try {
                // Let the thread sleep a bit.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

            guess = (int) (Math.random() * MAX_NUMBER + 1);
            counter++;

        } while (guess != number);

        // Only print output after correct guess
        System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses.**");

        // Increment counters after correct guess
        Shared.threadsDoneCount++;
        Shared.totalThreadGuesses += counter;
    }
}
