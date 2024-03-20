package Junior;
import java.util.Random;
import java.util.Stack;

public class numStack {

    public static Stack<Integer> genRanNum(int numDigits) {
        Random random = new Random();
        Stack<Integer> randomStack = new Stack<>();
        int randomNumber = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = random.nextInt(9) + 1;
            randomNumber = randomNumber * 10 + digit;
            randomStack.push(digit);
        }

        return randomStack;
    }

    public static Stack<Integer> genSigDigit(Stack<Integer> randomStack) {
        if (randomStack.isEmpty()) {
            return new Stack<>();
        }

        int digit = randomStack.pop();
        Stack<Integer> sigDigitStack = genSigDigit(randomStack);
        sigDigitStack.push(digit);
        return sigDigitStack;
    }

    public static void main(String[] args) {
        int numDigits = 5;
        Stack<Integer> randomStack = genRanNum(numDigits);
        Stack<Integer> sigDigitStack = genSigDigit((Stack<Integer>) randomStack.clone());

        System.out.println("Random Stack:");
        while (!randomStack.isEmpty()) {
            System.out.println(randomStack.pop());
        }

        System.out.println("\nSignificant digit stack:");
        while (!sigDigitStack.isEmpty()) {
            System.out.println(sigDigitStack.pop());
        }
    }
}
