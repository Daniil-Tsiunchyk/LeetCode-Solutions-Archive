import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerLosses {

  public static void main(String[] args) {
    System.out.println(
      Solution.findWinners(
        new int[][] {
          { 1, 3 },
          { 2, 3 },
          { 3, 6 },
          { 5, 6 },
          { 5, 7 },
          { 4, 5 },
          { 4, 8 },
          { 4, 9 },
          { 10, 4 },
          { 10, 9 },
        }
      )
    );
    System.out.println(
      Solution.findWinners(
        new int[][] { { 2, 3 }, { 1, 3 }, { 5, 4 }, { 6, 4 } }
      )
    );
  }

  static class Solution {

    public static List<List<Integer>> findWinners(int[][] matches) {
      Map<Integer, Integer> lossCount = new HashMap<>();
      for (int[] match : matches) {
        lossCount.put(match[1], lossCount.getOrDefault(match[1], 0) + 1);
        lossCount.putIfAbsent(match[0], 0);
      }

      List<Integer> noLosses = new ArrayList<>();
      List<Integer> oneLoss = new ArrayList<>();

      for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
        if (entry.getValue() == 0) {
          noLosses.add(entry.getKey());
        } else if (entry.getValue() == 1) {
          oneLoss.add(entry.getKey());
        }
      }

      Collections.sort(noLosses);
      Collections.sort(oneLoss);

      List<List<Integer>> answer = new ArrayList<>();
      answer.add(noLosses);
      answer.add(oneLoss);

      return answer;
    }
  }
}
