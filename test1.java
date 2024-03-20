package Sophmore;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Hi Geek (from main)");
        test1.main("Geek");
    }

    public static void main(String arg1) {
        System.out.println("Hi, "+ arg1);
        test1.main("Dear Geek", "My Geek");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", "+ arg2);
    }
}
