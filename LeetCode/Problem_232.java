import java.util.Stack;

public class Problem_232 {

  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.push(1);
    myQueue.push(2);
    System.out.println(myQueue.peek());
    System.out.println(myQueue.pop());
    System.out.println(myQueue.empty());
  }

  static class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
      stack1 = new Stack<>();
      stack2 = new Stack<>();
    }

    public static void push(int x) {
      stack1.push(x);
    }

    public static int pop() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.pop();
    }

    public static int peek() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.peek();
    }

    public static boolean empty() {
      return stack1.isEmpty() && stack2.isEmpty();
    }
  }
}
