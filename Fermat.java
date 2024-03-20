package Sophmore;

import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( "Fermat's Last Theorem: a^n+b^n != c^n (n!=2)");
        int a, b, c, n;
        System.out.print("Enter value for a:");
        a = s.nextInt();
        System.out.print("Enter value for b:");
        b = s.nextInt();
        System.out.print("Enter value for c:");
        c = s.nextInt();
        while(true){
            System.out.print("Enter value for n:");
            n = s.nextInt();
            if(n!=2)
                break;
            System.out.println("n cannot be 2");
        }
        checkFremat(a,b,c,n);
    }
    public static void checkFremat(int a, int b, int c, int n){
        if ((int)Math.pow(a, n)+(int)Math.pow(b, n)!=(int)Math.pow(c, n))
            System.out.println("Fermat was correct!");
        else
            System.out.println("Holy smokes, Fermat was wrong!");
    }
}

