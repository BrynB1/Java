package Sophmore;

public class percentageLetter {
    public static int percentageLetter(String s, char letter) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (letter == s.charAt(i)) {
                ++count;
            }
        }
        return (count * 100) / (n);
    }

    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("jjjj", 'k'));
    }
}
