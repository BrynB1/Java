package Sophmore;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Number of seconds:");
        int seconds = time.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print(seconds+" seconds"+"="+H+" Hours, " +M+ " Minutes, "+S+" Seconds ");
    }
}
