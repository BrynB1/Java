package Sophmore;

import java.util.HashMap;

class repeatedLetters {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();//keep letter times
        int len = s.length();
        for(int i = 0; i < len; i++) {//count letter times
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < len; i++) {//find the first letter occurs once
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("abccbaacz"));
        System.out.println(firstUniqChar("abcdd"));
    }
}