package Junior;

class Progression {
    protected long first;
    protected long cur;

    Progression() {
        cur = first = 0;
    }

    protected long firstValue() {
        cur = first;
        return cur;
    }

    protected long nextValue() {
        return ++cur;
    }

    public void printProgression(int n) {
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + nextValue());
        }
    }
}

class FiboProgression extends Progression {
    private long prev;

    FiboProgression() {
        first = 0;
        cur = 1;
        prev = 0;
    }

    protected long firstValue() {
        cur = first;
        prev = 1;
        return cur;
    }

    protected long nextValue() {
        long temp = cur;
        cur += prev;
        prev = temp;
        return cur;
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        FiboProgression fibo = new FiboProgression();
        fibo.printProgression(10);
    }
}
