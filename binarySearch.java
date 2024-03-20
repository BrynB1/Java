package Junior;

class binarySearchRecursion {

    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, high); // Search the right half
            } else {
                return binarySearchRecursive(arr, target, low, mid - 1); // Search the left half
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}

