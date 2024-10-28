package Junior.Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mod10 {
    public static void main(String[] args) {
        // Create the list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(52);
        arrayList.add(13);
        arrayList.add(32);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(75);
        arrayList.add(17);
        arrayList.add(22);
        arrayList.add(132);
        arrayList.add(9);

        // Create a new list with mod 10
        List<Integer> newList = new ArrayList<>();
        for (int num : arrayList) {
            int modResult = num % 10;
            newList.add(modResult);
        }

        // Count the occurrences of each digit
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < newList.size(); i++) {
            int digit = newList.get(i);
            int element = arrayList.get(i);

            // Check if the key exists
            if (!map.containsKey(digit)) {
                map.put(digit, new ArrayList<>());
            }

            map.get(digit).add(element);
        }
        // Print the counts
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("List % 10: " + newList);
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
