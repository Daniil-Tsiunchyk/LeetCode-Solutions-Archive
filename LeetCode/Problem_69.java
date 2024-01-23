public class Problem_69 {

  public static void main(String[] args) {
    System.out.println(Solution.mySqrt(4));
    System.out.println(Solution.mySqrt(8));
    System.out.println(Solution.mySqrt(2147395599));
  }

  static class Solution {

    public static int mySqrt(int x) {
      long r = x;
      while (r * r > x) {
        r = (r + x / r) / 2;
      }
      return (int) r;
    }
  }
}
