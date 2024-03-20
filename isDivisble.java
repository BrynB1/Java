package Sophmore;

import java.util.Scanner;
public class isDivisble {
    public static void main(String[] args) {
        divide();
    }
    static void divide(){
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter first integer: ");
        n = input.nextInt();
        System.out.print("Enter second integer: ");
        m = input.nextInt();
        boolean divisible = (n%m==0);
        boolean notdivisble = (n%m!=0);
        if (divisible){
            System.out.println(divisible);
        }
        else{
            System.out.println(notdivisble);
        }

    }

}
