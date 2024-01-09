public class Problem_13 {

  public static void main(String[] args) {
    System.out.println(
      "MCMXCIV = " + Solution.romanToInt("MCMXCIV") + " = " + 1994
    );
  }

  static class Solution {

    public static int romanToInt(String s) {
      int n = 0;
      int previous = 0;

      for (int i = s.length() - 1; i >= 0; i--) {
        int current = getRomanValue(s.charAt(i));

        if (current < previous) {
          n -= current;
        } else {
          n += current;
        }

        previous = current;
      }

      return n;
    }

    private static int getRomanValue(char c) {
      return switch (c) {
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> throw new IllegalStateException("Unexpected value: " + c);
      };
    }
  }
}
