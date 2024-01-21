public class Problem_198 {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 1 };
    System.out.println(Solution.rob(arr1));

    int[] arr2 = { 2, 7, 9, 3, 1 };
    System.out.println(Solution.rob(arr2));
  }

  static class Solution {

    public static int rob(int[] nums) {
      int n = nums.length;

      int robCurrent = nums[0];
      int robPrevious = 0;

      for (int i = 1; i < n; i++) {
        int temp = robCurrent;
        robCurrent = Math.max(robPrevious + nums[i], robCurrent);
        robPrevious = temp;
      }

      return Math.max(robCurrent, robPrevious);
    }
  }
}
