package Sophmore;

import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Hour:");
        int hour = time.nextInt();
        System.out.println("Minute:");
        int minute = time.nextInt();
        System.out.println("Second:");
        int second = time.nextInt();
        int secondsSinceMidnight = (hour* 3600) + (minute * 60) + second;
        System.out.println("Current Time:" + hour + ":" + minute + ":" + second);
        System.out.print("Seconds Since Midnight:" + secondsSinceMidnight);
    }
}
