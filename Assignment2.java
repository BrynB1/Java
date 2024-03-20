package Sophmore;
import java.util.Arrays;

public class Assignment2 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        nums = new int[]{3, 2, 4};
        target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        nums = new int[]{3, 3};
        target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}