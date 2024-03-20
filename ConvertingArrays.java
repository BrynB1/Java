package Sophmore;

import java.util.Arrays;
public class ConvertingArrays {
    public static void main(String[] args) {
        int [] source = {1,2,3,4,5,6};
        int [] destination = new int[6];
        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println(Arrays.toString(destination));
    }
}
