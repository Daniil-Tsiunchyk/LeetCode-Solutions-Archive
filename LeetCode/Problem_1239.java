import java.util.List;

public class Problem_1239 {

  public static void main(String[] args) {
    System.out.println(
      Solution.maxLength(List.of(new String[] { "un", "iq", "ue" }))
    );
    System.out.println(
      Solution.maxLength(List.of(new String[] { "cha", "r", "act", "ers" }))
    );
    System.out.println(
      Solution.maxLength(List.of(new String[] { "abcdefghijklmnopqrstuvwxyz" }))
    );
  }

  static class Solution {

    public static int maxLength(List<String> arr) {
      return backtrack(arr, 0, "");
    }

    private static int backtrack(List<String> arr, int index, String current) {
      if (index == arr.size()) {
        if (hasUniqueCharacters(current)) {
          return current.length();
        } else {
          return 0;
        }
      }

      int includeLength = 0;
      if (hasUniqueCharacters(current + arr.get(index))) {
        includeLength = backtrack(arr, index + 1, current + arr.get(index));
      }

      int excludeLength = backtrack(arr, index + 1, current);

      return Math.max(includeLength, excludeLength);
    }

    private static boolean hasUniqueCharacters(String s) {
      int[] frequency = new int[26];
      for (char c : s.toCharArray()) {
        if (frequency[c - 'a'] > 0) {
          return false;
        }
        frequency[c - 'a']++;
      }
      return true;
    }
  }
}
