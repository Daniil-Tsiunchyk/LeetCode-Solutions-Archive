public class Problem_273 {

  public static void main(String[] args) {
    System.out.println(Solution.numberToWords(123));
    System.out.println(Solution.numberToWords(12345));
    System.out.println(Solution.numberToWords(1234567));
    System.out.println(Solution.numberToWords(50868));
    System.out.println(Solution.numberToWords(100000));
  }

  public static class Solution {

    public static String numberToWords(int num) {
      if (num == 0) {
        return "Zero";
      }

      StringBuilder words = new StringBuilder();
      int unitIndex = 0;

      while (num > 0) {
        if (num % 1000 != 0) {
          String threeDigits = convertThreeDigits(num % 1000);
          if (!threeDigits.isEmpty()) {
            if (!words.isEmpty()) {
              words.insert(0, " ");
            }
            words.insert(0, threeDigits + " " + getUnit(unitIndex));
          }
        }
        num /= 1000;
        unitIndex++;
      }

      return words.toString().trim();
    }

    private static String convertThreeDigits(int num) {
      if (num == 0) {
        return "";
      }

      StringBuilder words = new StringBuilder();

      if (num >= 100) {
        words.append(getDigit(num / 100)).append(" Hundred");
        num %= 100;
        if (num > 0) {
          words.append(" ");
        }
      }

      if (num >= 10 && num < 20) {
        words.append(getTeen(num - 10));
      } else if (num >= 20) {
        words.append(getTens(num / 10));
        if (num % 10 != 0) {
          words.append(" ").append(getDigit(num % 10));
        }
      } else if (num > 0) {
        words.append(getDigit(num));
      }

      return words.toString().trim();
    }

    private static String getUnit(int index) {
      return switch (index) {
        case 1 -> "Thousand";
        case 2 -> "Million";
        case 3 -> "Billion";
        default -> "";
      };
    }

    private static String getDigit(int digit) {
      return switch (digit) {
        case 1 -> "One";
        case 2 -> "Two";
        case 3 -> "Three";
        case 4 -> "Four";
        case 5 -> "Five";
        case 6 -> "Six";
        case 7 -> "Seven";
        case 8 -> "Eight";
        case 9 -> "Nine";
        default -> "";
      };
    }

    private static String getTeen(int num) {
      return switch (num) {
        case 0 -> "Ten";
        case 1 -> "Eleven";
        case 2 -> "Twelve";
        case 3 -> "Thirteen";
        case 4 -> "Fourteen";
        case 5 -> "Fifteen";
        case 6 -> "Sixteen";
        case 7 -> "Seventeen";
        case 8 -> "Eighteen";
        case 9 -> "Nineteen";
        default -> "";
      };
    }

    private static String getTens(int num) {
      return switch (num) {
        case 2 -> "Twenty";
        case 3 -> "Thirty";
        case 4 -> "Forty";
        case 5 -> "Fifty";
        case 6 -> "Sixty";
        case 7 -> "Seventy";
        case 8 -> "Eighty";
        case 9 -> "Ninety";
        default -> "";
      };
    }
  }
}
