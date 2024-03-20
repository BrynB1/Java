package Sophmore;

import java.util.Scanner;
public class indexofmax {
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] myArray = new int [size];
        System.out.println("Enter the elements of the array one by one ");
        for(int i=0; i<size; i++) {
            myArray[i] = s.nextInt();
        }
        if (myArray.length == 0) {
            System.out.println("-1");
        }
        int max = myArray[0];
        int pos = 0;

        for (int i = 1; i < myArray.length; i++) {
            if (max < myArray[i]) {
                pos = i;
                max = myArray[i];
            }
        }
        System.out.println(pos);
    }
}
