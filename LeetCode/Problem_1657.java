import java.util.Arrays;

public class Problem_1657 {

  public static class Main {

    public static void main(String[] args) {
      System.out.println(Solution.closeStrings("abc", "bca"));
      System.out.println(Solution.closeStrings("a", "aa"));
      System.out.println(Solution.closeStrings("cabbba", "abbccc"));
    }
  }

  static class Solution {

    public static boolean closeStrings(String word1, String word2) {
      if (word1.length() != word2.length()) {
        return false;
      }

      int[] count1 = new int[26];
      int[] count2 = new int[26];
      boolean[] exists1 = new boolean[26];
      boolean[] exists2 = new boolean[26];

      for (int i = 0; i < word1.length(); i++) {
        count1[word1.charAt(i) - 'a']++;
        exists1[word1.charAt(i) - 'a'] = true;

        count2[word2.charAt(i) - 'a']++;
        exists2[word2.charAt(i) - 'a'] = true;
      }

      for (int i = 0; i < 26; i++) {
        if (exists1[i] != exists2[i]) {
          return false;
        }
      }

      Arrays.sort(count1);
      Arrays.sort(count2);

      return Arrays.equals(count1, count2);
    }
  }
}
