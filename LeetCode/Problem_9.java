public class Problem_9 {

  public static void main(String[] args) {
    System.out.println(Solution.isPalindrome(121));
    System.out.println(Solution.isPalindrome(-121));
    System.out.println(Solution.isPalindrome(10));
  }

  public static class Solution {

    public static boolean isPalindrome(int x) {
      return String
        .valueOf(x)
        .contentEquals(new StringBuilder(String.valueOf(x)).reverse());
    }
  }
}
