package Sophmore;

import java.util.Scanner;
public class Date2 {
    public static void main(String[] args) {
        printamerican();
        printeuropean();
    }
    static void printamerican(){
        Scanner myObj = new Scanner(System.in);
        Scanner newObj = new Scanner(System.in);
        System.out.println("Please enter in the date");
        System.out.println("Day of the week:");
        String day = myObj.nextLine();
        System.out.println("DD");
        int DD = myObj.nextInt();
        System.out.println("Month");
        String month = newObj.nextLine();
        System.out.println("YYYY");
        int YYYY = myObj.nextInt();
        System.out.println("American format:");
        System.out.println(day + ", " + month+" "+ DD + ", " + YYYY + ".");
    }
    static void printeuropean(){
        Scanner myObj = new Scanner(System.in);
        Scanner newObj = new Scanner(System.in);
        System.out.println("Please enter in the date");
        System.out.println("Day of the week:");
        String day = myObj.nextLine();
        System.out.println("DD");
        int DD = myObj.nextInt();
        System.out.println("Month");
        String month = newObj.nextLine();
        System.out.println("YYYY");
        int YYYY = myObj.nextInt();
        System.out.println("European format:");
        System.out.println(day + ", " + DD +" "+ month +" "+ YYYY + ".");
    }
}
