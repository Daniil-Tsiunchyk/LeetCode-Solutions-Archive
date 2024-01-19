public class Problem_12 {

  public static void main(String[] args) {
    int[][] matrix1 = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
    int[][] matrix2 = { { -19, 57 }, { -40, -5 } };
    System.out.println(Solution.minFallingPathSum(matrix1));
    System.out.println(Solution.minFallingPathSum(matrix2));
  }

  static class Solution {

    public static int minFallingPathSum(int[][] matrix) {
      int n = matrix.length;
      for (int i = 1; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int upLeft = (j > 0) ? matrix[i - 1][j - 1] : Integer.MAX_VALUE;
          int up = matrix[i - 1][j];
          int upRight = (j < n - 1) ? matrix[i - 1][j + 1] : Integer.MAX_VALUE;

          matrix[i][j] += Math.min(up, Math.min(upLeft, upRight));
        }
      }

      int minSum = Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        minSum = Math.min(minSum, matrix[n - 1][j]);
      }
      return minSum;
    }
  }
}
