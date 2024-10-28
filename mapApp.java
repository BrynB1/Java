package Junior.Final;

import java.util.*;

public class mapApp {
    public static void main(String[] args) {
        simpleHeap();
        wordCount();
        twoSum();
    }

    private static void wordCount() {
        Map<String, Integer> map = new Hashtable<>();
        String str = "monmouth university is a university in a small town";
        StringTokenizer t = new StringTokenizer(str, " ");
        while(t.hasMoreTokens()){
            String word = t.nextToken();
            if (map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.toString());
        }
    }

    public static void twoSum() {
        int[] arr = {1, 3, 5, 10, 34, 0, -4, -10, 90};
        Set<Integer> hset = new HashSet<>();
        for (int num : arr) {
            int sum = -num;
            if (hset.contains(sum)) {
                System.out.println("Found two numbers that add up to 0: " + num + " and " + sum);
                return;
            }
            hset.add(num);
        }
        System.out.println("No two numbers found that add up to 0.");
    }

    public static void simpleHeap(){
        Map<Integer, String> map = new Hashtable<>();
        map.put(1001, "Joe");
        map.put(1002, "Jim");
        map.put(1002, "Jake");
        map.put(1005, "Tom");
        //Print Map
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.toString());
        }
        //Print Key
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }
        //Search
        System.out.println(map.get(1002));
        //Change value
        map.put(1005, "Brian");
        System.out.println(map.get(1005));
        //Contains Key
        System.out.println(map.containsKey(1005));
    }
}
