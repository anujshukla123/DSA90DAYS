package Arrays;

import java.util.Arrays;

public class MaximumMedianSum {
    public static long maxMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int groups = n / 3;
        long sum = 0;

        // Pick medians starting from index n - groups*2, every second element
        for (int i = n - 2; i >= n - groups * 2; i -= 2) {
            sum += nums[i];
        }

        return sum;
    }

    // Test driver
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 3, 2, 1, 3};
        System.out.println(maxMedianSum(nums1)); // Output: 5

        int[] nums2 = {1, 1, 10, 10, 10, 10};
        System.out.println(maxMedianSum(nums2)); // Output: 20
    }
}

