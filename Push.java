package Sophmore;

import java.util.Stack;
public class Push {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        System.out.println("Initial Stack:"+ animals);
        String top = animals.peek();
        System.out.println("Element at top:" + top);
        int pos = animals.search("Horse");
        System.out.println("Position of Horse:"+ pos);
        boolean result =animals.empty();
        System.out.println("Is the stack empty? "+ result);
    }
}
