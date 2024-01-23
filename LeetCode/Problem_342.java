public class Problem_342 {

  public static void main(String[] args) {
    System.out.println(Solution.isPowerOfFour(16));
    System.out.println(Solution.isPowerOfFour(5));
    System.out.println(Solution.isPowerOfFour(1));
  }

  static class Solution {

    public static boolean isPowerOfFour(int n) {
      if (n <= 0) {
        return false;
      }

      while (n % 4 == 0) {
        n /= 4;
      }

      return n == 1;
    }
  }
}
