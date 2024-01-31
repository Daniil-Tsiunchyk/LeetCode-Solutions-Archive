public class Problem_739 {

  static class Solution {

    public static int[] dailyTemperatures(int[] temperatures) {
      int n = temperatures.length;
      int[] result = new int[n];
      Stack<Integer> stack = new Stack<>();

      for (int i = 0; i < n; i++) {
        while (
          !stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]
        ) {
          int prevIndex = stack.pop();
          result[prevIndex] = i - prevIndex;
        }
        stack.push(i);
      }

      return result;
    }
  }
}
