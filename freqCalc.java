package Junior.Final;

import java.util.*;

public class freqCalc {
    public static void main(String[] args) {
        List<Integer> ranNum = genRanNum();
        TreeMap<Integer, Integer> numFreqMap = new TreeMap<>();

        for (int num : ranNum) {
            if (numFreqMap.containsKey(num)) {
                numFreqMap.put(num, numFreqMap.get(num) + 1);
            } else {
                numFreqMap.put(num, 1);
            }
        }

        int mostNum = findNum(numFreqMap);

        System.out.println("Number Frequency Map:");
        for (Map.Entry<Integer, Integer> entry : numFreqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }

        System.out.println("Most frequent number: " + mostNum);
    }

    private static List<Integer> genRanNum() {
        List<Integer> ranNums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randNum = random.nextInt(20 - 1 + 1) + 1;
            ranNums.add(randNum);
        }

        return ranNums;
    }

    private static int findNum(TreeMap<Integer, Integer> numFreqMap) {
        int mostFreqNum = -1;
        int maxFreq = -1;

        for (Map.Entry<Integer, Integer> entry : numFreqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFreqNum = entry.getKey();
            }
        }
        return mostFreqNum;
    }
}
