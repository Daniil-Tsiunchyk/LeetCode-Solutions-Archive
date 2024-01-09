public class Problem_12 {

  public static void main(String[] args) {
    System.out.println("1994 = " + Solution.intToRoman(1994) + " = MCMXCIV");
  }

  public static class Solution {

    public static String intToRoman(int num) {
      int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
      String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

      StringBuilder str = new StringBuilder();

      for (int i = 0; i < values.length; i++) {
        while (num >= values[i]) {
          num -= values[i];
          str.append(symbols[i]);
        }
      }

      return str.toString();
    }
  }
}
