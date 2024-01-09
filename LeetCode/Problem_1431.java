import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {

  public static void main(String[] args) {
    System.out.println(Solution.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
    System.out.println(Solution.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
    System.out.println(Solution.kidsWithCandies(new int[] { 12, 1, 12 }, 10));
  }

  public static class Solution {

    public static List<Boolean> kidsWithCandies(
      int[] candies,
      int extraCandies
    ) {
      int max = candies[0];
      for (int candy : candies) {
        if (max < candy) max = candy;
      }
      List<Boolean> flags = new ArrayList<>();
      for (int candy : candies) {
        flags.add(candy + extraCandies >= max);
      }
      return flags;
    }
  }
}
