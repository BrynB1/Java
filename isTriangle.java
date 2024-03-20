package Sophmore;

import java.util.*;
public class isTriangle {
    public static int checkTriangle(int a, int b, int c)
    {
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first integer: ");
        a = input.nextInt();
        System.out.print("Enter second integer: ");
        b = input.nextInt();
        System.out.print("Enter third integer: ");
        c = input.nextInt();
        if ((checkTriangle(a, b, c)) == 1)
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}
