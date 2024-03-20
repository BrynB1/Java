package Junior;

import java.util.Stack;

public class mergeStacks {
    public static void addStackToAnother(Stack<Integer> s, Stack<Integer> t) {
        Stack<Integer> temp = new Stack<>();
        while (!t.isEmpty()) {
            temp.push(t.pop());
        }
        while (!temp.isEmpty()) {
            int value = temp.pop();
            s.push(value);
            t.push(value);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> r = new Stack<>();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> t = new Stack<>();
        r.push(3);
        r.push(4);
        s.push(2);
        s.push(1);
        t.push(7);
        t.push(3);
        System.out.println("Before merging:");
        System.out.println("Stack r: " + r);
        System.out.println("Stack s: " + s);
        System.out.println("Stack t: " + t);
        addStackToAnother(s, t);
        System.out.println("After merging:");
        System.out.println("Stack r: " + r);
        System.out.println("Stack s: " + s);
        System.out.println("Stack t: " + t);
    }
}
