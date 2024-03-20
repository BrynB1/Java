package Sophmore;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        System.out.println("num=");
        int num=nums.nextInt();
        int sum = 0;
        while (num > 0 || sum > 9)
        {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}