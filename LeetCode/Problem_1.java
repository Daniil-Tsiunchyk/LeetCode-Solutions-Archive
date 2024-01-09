import java.util.Arrays;
import java.util.HashMap;

public class Problem_1 {

  public static void main(String[] args) {
    System.out.println(
      Arrays.toString(Solution.twoSum(new int[] { 2, 7, 11, 13 }, 9))
    );
  }

  static class Solution {

    public static int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> numToIndex = new HashMap<>(nums.length);
      for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numToIndex.containsKey(complement)) {
          return new int[] { numToIndex.get(complement), i };
        }
        numToIndex.put(nums[i], i);
      }
      return null;
    }
  }
}
