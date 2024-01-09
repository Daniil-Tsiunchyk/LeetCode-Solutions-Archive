public class Problem_231 {

  public static void main(String[] args) {
    System.out.println(Solution.isPowerOfTwo(1));
    System.out.println(Solution.isPowerOfTwo(16));
    System.out.println(Solution.isPowerOfTwo(3));
  }

  static class Solution {

    public static boolean isPowerOfTwo(int n) {
      if (n <= 0) {
        return false;
      }

      while (n % 2 == 0) {
        n /= 2;
      }

      return n == 1;
    }
  }
}
