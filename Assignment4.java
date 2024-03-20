package Sophmore;
public class Assignment4{
    static int lastWordLength(String s) {
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >=0; i --){
            if (s.charAt(i) == ' '){
                break;
            }
            else {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lastWordLength("Hello World"));
        System.out.println(lastWordLength("fly me to the moon"));
        System.out.println(lastWordLength("luffy is still joyboy"));
    }
}
