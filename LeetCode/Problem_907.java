import java.util.Stack;

class Problem_907 {

  public static void main(String[] args) {
    System.out.println(Solution.sumSubarrayMins(new int[] { 3, 1, 2, 4 }));
    System.out.println(Solution.sumSubarrayMins(new int[] { 11, 81, 94, 43, 3 }));
  }

  static class Solution {

    public static int sumSubarrayMins(int[] arr) {
      final int MOD = 1_000_000_007;
      int n = arr.length;
      long result = 0;
      Stack<Integer> stack = new Stack<>();
      int[] left = new int[n];
      int[] right = new int[n];

      for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
          stack.pop();
        }
        left[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(i);
      }

      stack.clear();

      for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
          stack.pop();
        }
        right[i] = stack.isEmpty() ? n : stack.peek();
        stack.push(i);
      }

      for (int i = 0; i < n; i++) {
        result =
          (result + (long) arr[i] * (i - left[i]) * (right[i] - i)) % MOD;
      }

      return (int) result;
    }
  }
}
