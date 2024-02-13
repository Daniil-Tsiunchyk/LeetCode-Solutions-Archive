public class Problem_2108 {

  public static void main(String[] args) {
    System.out.println(Solution.firstPalindrome(new String[] { "abc", "car", "ada", "racecar", "cool" }));
    System.out.println(Solution.firstPalindrome(new String[] { "notapalindrome", "racecar" }));
    System.out.println(Solution.firstPalindrome(new String[] { "def", "ghi" }));
  }

  static class Solution {

    public static String firstPalindrome(String[] words) {
      for (String word : words) {
        if (isPalindrome(word)) {
          return word;
        }
      }
      return "";
    }

    private boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length() - 1;

      while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
          return false;
        }
        left++;
        right--;
      }

      return true;
    }
  }
}
