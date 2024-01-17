import java.util.HashMap;
import java.util.HashSet;

public class Problem_1207 {

  public static void main(String[] args) {
    System.out.println(Solution.uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
    System.out.println(Solution.uniqueOccurrences(new int[] { 1, 2 }));
    System.out.println(Solution.uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
  }

  public static class Solution {

    public static boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer, Integer> occurrences = new HashMap<>();
      for (int num : arr) {
        occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
      }

      HashSet<Integer> uniqueCounts = new HashSet<>(occurrences.values());
      return uniqueCounts.size() == occurrences.size();
    }
  }
}
