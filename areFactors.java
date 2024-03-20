package Sophmore;
public class areFactors {
    public static boolean areFactors(int n, int[] arr) {
        for (int j : arr) {
            if (j % n != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(areFactors(1, new int[]{4}));
    }
}
