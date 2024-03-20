package Sophmore;

import java.util.*;
public class isAbecedarian {
    public static boolean is_abecedarian_word(String word) {
        int index = word.length() - 1;

        for (int i = 0; i < index; i++) {

            if (word.charAt(i) <= word.charAt(i + 1)) {
            }

            else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word1 = scanner.nextLine();
        System.out.println("Is Abecadrian word? "+is_abecedarian_word(word1));
    }
}

