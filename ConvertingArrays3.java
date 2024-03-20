package Sophmore;

import java.util.Arrays;

public class ConvertingArrays3 {
    public static void main(String[] args) {
        int [] source = {2,3,12,4,12,-2};
        int [] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1="+ Arrays.toString(destination1));
        int [] destination2= Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2="+ Arrays.toString(destination2));
    }
}
