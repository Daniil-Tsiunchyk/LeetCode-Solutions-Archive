public class Problem_1704 {

  public static void main(String[] args) {
    System.out.println(Solution.halvesAreAlike("book"));
    System.out.println(Solution.halvesAreAlike("textbook"));
  }

  static class Solution {

    public static boolean halvesAreAlike(String s) {
      String vowels = "aeiouAEIOU";
      int mid = s.length() / 2;
      int n = 0;

      for (int i = 0; i < mid; i++) {
        if (vowels.indexOf(s.charAt(i)) >= 0) n++;
        if (vowels.indexOf(s.charAt(i + mid)) >= 0) n--;
      }

      return n == 0;
    }
  }
}
