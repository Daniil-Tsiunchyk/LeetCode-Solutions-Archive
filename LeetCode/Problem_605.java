public class Problem_605 {

  public static void main(String[] args) {
    System.out.println(
      Solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1)
    );
    System.out.println(
      Solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2)
    );
    System.out.println(
      Solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 1 }, 2)
    );
    System.out.println(
      Solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 0, 1 }, 2)
    );
  }

  public static class Solution {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
      int count = 0;
      int i = 0;
      while (i < flowerbed.length) {
        if (flowerbed[i] == 0) {
          int prev = (i == 0) ? 0 : flowerbed[i - 1];
          int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
          if (prev == 0 && next == 0) {
            count++;
            i++;
            if (count >= n) return true;
          }
        }
        i++;
      }
      return count >= n;
    }
  }
}
