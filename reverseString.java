package Sophmore;

public class reverseString {
    public static void main (String[] args) {

        String str= "coffee";
        StringBuilder nstr= new StringBuilder();
        char ch;

        System.out.print("Original word: ");
        System.out.println(str);

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr.insert(0, ch);
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

