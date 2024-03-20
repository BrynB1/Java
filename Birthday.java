package Sophmore;

import java.util.Scanner;
public class Birthday {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your birth year: (YYYY)");
        int year = myObj.nextInt();
        System.out.println("Please enter your birth month: (MM)");
        int month = myObj.nextInt();
        System.out.println("Please enter your birth date: (DD)");
        int day = myObj.nextInt();
        System.out.println("Your full birthday is: "+ month + day+","+year);
    }
}
