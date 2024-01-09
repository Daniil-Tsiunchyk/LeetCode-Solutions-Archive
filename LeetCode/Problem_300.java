import java.util.Arrays;

public class Problem_300 {

  public static void main(String[] args) {
    System.out.println(Solution.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    System.out.println(Solution.lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
    System.out.println(Solution.lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
  }

  static class Solution {

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
}
