package Sophmore;

import java.util.Scanner;

public class Multadd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Enter first integer: ");
        a = input.nextInt();
        System.out.print("Enter second integer: ");
        b = input.nextInt();
        System.out.print("Enter third integer: ");
        c = input.nextInt();
        d=a*b+c;
        System.out.println(d);
    }
}
