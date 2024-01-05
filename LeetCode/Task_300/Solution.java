package Task_300;

import java.util.Arrays;

class Solution {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int length : arr) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
