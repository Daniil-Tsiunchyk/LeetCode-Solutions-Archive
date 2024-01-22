import java.util.HashSet;

public class Problem_645 {

  static class Solution {

    public static int[] findErrorNums(int[] nums) {
      int n = nums.length; // [1, 2, 2, 4]  // 4
      int actualSum = 0;
      int uniqueSum = 0;

      for (int num : nums) {
        actualSum += num;
      }

      HashSet<Integer> uniqueSet = new HashSet<>();
      for (int num : nums) {
        uniqueSet.add(num);
      }

      for (int uniqueNum : uniqueSet) {
        uniqueSum += uniqueNum;
      }

      int expectedSum = n * (n + 1) / 2; // 4 * (5) / 2 = 10

      int duplicate = actualSum - uniqueSum; // 9 - 7 = 2
      int missing = expectedSum - uniqueSum; // 10 - 7 = 3

      return new int[] { duplicate, missing }; // [2, 3]
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 4 };
    int[] result = Solution.findErrorNums(nums);
    System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
  }
}
