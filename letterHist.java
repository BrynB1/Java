package Sophmore;

import java.util.Arrays;
import java.util.Scanner;

public class letterHist {
    public static int[] letterHist(String s) {
        int[] hist = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char curChar = s.toLowerCase().charAt(i);
            if ('a' <= curChar && curChar <= 'z') {
                hist[curChar-'a']++;
            }
        }

        return hist;
    }

    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        word = sc.nextLine();
        System.out.println(Arrays.toString(letterHist(word)));

    }
}

