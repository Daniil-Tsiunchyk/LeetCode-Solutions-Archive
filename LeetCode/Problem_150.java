import java.util.Stack;

public class Problem_150 {

  class Solution {

    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();

      for (String token : tokens) {
        if (
          token.equals("+") ||
          token.equals("-") ||
          token.equals("*") ||
          token.equals("/")
        ) {
          int b = stack.pop();
          int a = stack.pop();
          stack.push(performOperation(a, b, token));
        } else {
          stack.push(Integer.parseInt(token));
        }
      }

      return stack.pop();
    }

    private int performOperation(int a, int b, String operator) {
      switch (operator) {
        case "+":
          return a + b;
        case "-":
          return a - b;
        case "*":
          return a * b;
        case "/":
          return a / b;
        default:
          return 0;
      }
    }
  }
}
