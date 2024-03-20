package Junior;

import java.util.Arrays;

class evenOdd {
    public static void rearrange(int[] arr) {
        rearrange(arr, 0, arr.length - 1);
    }
    private static void rearrange(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        if (arr[start] % 2 == 1 && arr[end] % 2 == 0) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        if (arr[start] % 2 == 0) {
            rearrange(arr, start + 1, end);
        }
        if (arr[end] % 2 == 1) {
            rearrange(arr, start, end - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original array: " + Arrays.toString(arr));
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
