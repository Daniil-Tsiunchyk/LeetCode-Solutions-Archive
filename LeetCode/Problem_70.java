public class Problem_70 {

  public static void main(String[] args) {
    System.out.println(Solution.climbStairs(1));
    System.out.println(Solution.climbStairs(2));
    System.out.println(Solution.climbStairs(3));
  }

  static class Solution {

    public static int climbStairs(int n) {
      if (n <= 2) {
        return n;
      }

      int first = 1;
      int second = 2;

      for (int i = 3; i <= n; i++) {
        int third = first + second;
        first = second;
        second = third;
      }

      return second;
    }
  }
}
