import java.util.Arrays;

public class Problem_455 {

  public static void main(String[] args) {
    System.out.println(
      Solution.findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 })
    );
    System.out.println(
      Solution.findContentChildren(new int[] { 1, 2 }, new int[] { 1, 2, 3 })
    );
  }

  static class Solution {

    public static int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int n = g.length, m = s.length;
      int i = 0, j = 0, count = 0;

      while (i < n && j < m) {
        if (s[j] >= g[i]) {
          count++;
          i++;
        }
        j++;
      }

      return count;
    }
  }
}
