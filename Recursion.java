package Junior;

class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, 4);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] a, int i, int j) {
        if (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            reverseArray(a, i + 1, j - 1);
        }
    }
}
