package Junior;

import java.util.Scanner;
import java.util.Stack;

class stackApp {

    public static boolean checkExpression(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        System.out.println(checkExpression(expression) ? "The expression is valid." : "The expression is NOT valid.");

        scanner.close();
    }
}
