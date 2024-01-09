public class Problem_326 {

  public static void main(String[] args) {
    System.out.println(Solution.isPowerOfThree(27));
    System.out.println(Solution.isPowerOfThree(0));
    System.out.println(Solution.isPowerOfThree(-1));
  }

  static class Solution {

    public static boolean isPowerOfThree(int n) {
      if (n <= 0) {
        return false;
      }

      while (n % 3 == 0) {
        n /= 3;
      }

      return n == 1;
    }
  }
}
