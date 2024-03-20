package Junior;

import java.util.Stack;

public class stackChecker {
    public static boolean areEqual(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        boolean equal = true;
        while (!stack1.isEmpty()) {
            int elem1 = stack1.pop();
            int elem2 = stack2.pop();
            temp1.push(elem1);
            temp2.push(elem2);
            if (elem1 != elem2) {
                equal = false;
                break;
            }
        }
        while (!temp1.isEmpty()) {
            stack1.push(temp1.pop());
        }
        while (!temp2.isEmpty()) {
            stack2.push(temp2.pop());
        }
        return equal;
    }

    public static void main(String[] args) {
        //Create stacks
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        Stack<Integer> s4 = new Stack<>();
        //Fill stacks
        s1.push(10); s1.push(8); s1.push(6); s1.push(-8); s1.push(0); s1.push(3);
        s2.push(10); s2.push(8); s2.push(6); s2.push(-8); s2.push(0); s2.push(3);
        s3.push(null); s3.push(6); s3.push(9); s3.push(3); s3.push(1); s3.push(5);
        s4.push(null); s4.push(1); s4.push(6); s4.push(9); s4.push(3); s4.push(5);
        //Print stacks
        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
        System.out.println("S3: " + s3);
        System.out.println("S4: " + s4);
        //Check if stacks are equal
        boolean s1AndS2Equal = areEqual(s1, s2);
        boolean s3AndS4Equal = areEqual(s3, s4);
        System.out.println("S1 and S2 are equal: " + s1AndS2Equal);
        System.out.println("S3 and S4 are equal: " + s3AndS4Equal);
    }
}
