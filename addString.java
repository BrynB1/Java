package Sophmore;
import java.util.Scanner;
public class addString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter num1:");
        String num1 = myObj.nextLine();
        System.out.println("Enter num2:");
        String num2 = myObj.nextLine();
        String num3=num1+num2;
        System.out.println(num3);
    }
}
