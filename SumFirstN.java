// SumFirstN.java
class Summation implements Runnable {
    private int upper; // value of N

    public Summation(int upper) {
        this.upper = upper;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i <= upper; i++)
            sum += i;
        Shared.sum = sum;
    }
}

public class SumFirstN {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (Integer.parseInt(args[0]) < 0)
                System.err.println(args[0] + " must be >= 0.");
            else {
                int upper = Integer.parseInt(args[0]); // value of N
                Thread thrd = new Thread(new Summation(upper));
                thrd.start();
                try {
                    thrd.join(); // Wait for thrd to complete.
                    System.out.println("The sum of the first " + upper +
                            " integers is " + Shared.sum);
                } catch (InterruptedException ie) {
                }
            }
        } else
            System.err.println("Usage: SumFirstN <integer value>");
    }
}
