package Sophmore;
import java.util.Scanner;

public class isPalidrome {
    public static boolean isPalindrome(String str)
    {
        StringBuilder rev = new StringBuilder();
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (str.equals(rev.toString())) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
