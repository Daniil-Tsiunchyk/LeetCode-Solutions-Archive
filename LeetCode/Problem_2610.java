import java.util.*;

public class Problem_2610 {

  public static void main(String[] args) {
    System.out.println(Solution.findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 }));
    System.out.println(Solution.findMatrix(new int[] { 1, 2, 3, 4 }));
  }

  static class Solution {

    public static List<List<Integer>> findMatrix(int[] nums) {
      List<Set<Integer>> sets = new ArrayList<>();
      for (int num : nums) {
        boolean added = false;
        for (Set<Integer> set : sets) {
          if (!set.contains(num)) {
            set.add(num);
            added = true;
            break;
          }
        }
        if (!added) {
          Set<Integer> newSet = new HashSet<>();
          newSet.add(num);
          sets.add(newSet);
        }
      }

      List<List<Integer>> result = new ArrayList<>();
      for (Set<Integer> set : sets) {
        result.add(new ArrayList<>(set));
      }
      return result;
    }
  }
}
