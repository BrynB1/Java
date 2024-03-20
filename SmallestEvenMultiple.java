package Sophmore;

import java.util.*;
class GFG
{
    static int findSmallestNumber(ArrayList<Integer> arr, int n)
    {
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            dp.add(Integer.MAX_VALUE - 5);
        ArrayList <ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(new ArrayList<>(Arrays.asList(-1, 0)));
        Collections.sort(arr);
        ArrayList<Integer> q = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                if (dp.get(i % n) > 1000000000) {
                    q.add(i % n);
                    dp.set(i % n, 1);
                    result.set(i % n, new ArrayList<>(Arrays.asList(-1, i)));
                }
            }
        }
        while (q.size() != 0) {
            int u = q.get(0);
            q.remove(0);
            for (int i : arr) {
                int v = (u * 10 + i) % n;
                if (dp.get(u) + 1 < dp.get(v)) {
                    dp.set(v, dp.get(u) + 1);
                    q.add(v);
                    result.set(v, new ArrayList<>(Arrays.asList(u, i)));
                }
            }
        }
        if (dp.get(0) > 1000000000)
            return -1;
        else {
            ArrayList<Integer> ans = new ArrayList<>();
            int u = 0;
            while (u != -1) {
                ans.add(result.get(u).get(1));
                u = result.get(u).get(0);
            }

            // Reverse the vector
            Collections.reverse(ans);

            for (int i : ans) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 3));
        int n = 12;

        System.out.println(findSmallestNumber(arr, n));
    }
}
