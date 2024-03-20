package Sophmore;

public class canSpell {
    public static boolean canSpell(String letter, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (letter.indexOf(word.charAt(i)) == -1) { // <-- change to '=='
                return false;
            } else {
                int charLocation = letter.indexOf(word.charAt(i));
                letter = letter.substring(0, charLocation)
                        + letter.substring(charLocation + 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        if (canSpell("hello", "he")) {
            System.out.println("it CAN spell");
        } else {
            System.out.println("it CANNOT spell");
        }
    }
}
