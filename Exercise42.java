package Sophmore;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        zool();
    }
    static void zool(){
        Scanner myObj = new Scanner(System.in);
        Scanner newObj = new Scanner(System.in);
        int a =11;
        System.out.println("Please enter your pet's name:");
        String pet = myObj.nextLine();
        System.out.println("Please enter your steet name:");
        String street = newObj.nextLine();
        System.out.println(a+" Pet name: "+pet+" Street name: "+ street);
    }
}
