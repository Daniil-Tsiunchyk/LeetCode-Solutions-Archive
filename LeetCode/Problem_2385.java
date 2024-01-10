import java.util.*;

public class Problem_2385 {

  public static void main(String[] args) {
      TreeNode root = new TreeNode(1,
              new TreeNode(5, null, new TreeNode(4)),
              new TreeNode(3, new TreeNode(10, null, new TreeNode(6, new TreeNode(9), new TreeNode(2))), null));
      int start = 3;

    System.out.println(Solution.amountOfTime(root, start));
  }

  static class Solution {

    public static int amountOfTime(TreeNode root, int start) {
      if (root == null) return 0;

      Map<Integer, List<Integer>> graph = new HashMap<>();
      buildGraph(root, null, graph);

      Queue<Integer> queue = new LinkedList<>();
      Set<Integer> visited = new HashSet<>();
      queue.offer(start);
      visited.add(start);

      int time = -1;
      while (!queue.isEmpty()) {
        int size = queue.size();
        time++;

        for (int i = 0; i < size; i++) {
          Integer node = queue.poll();
          if (node != null) {
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
              if (!visited.contains(neighbor)) {
                queue.offer(neighbor);
                visited.add(neighbor);
              }
            }
          }
        }
      }
      return time;
    }

    private static void buildGraph(
      TreeNode node,
      TreeNode parent,
      Map<Integer, List<Integer>> graph
    ) {
      if (node != null) {
        if (!graph.containsKey(node.val)) {
          graph.put(node.val, new ArrayList<>());
        }
        if (parent != null) {
          graph.get(node.val).add(parent.val);
          graph.get(parent.val).add(node.val);
        }
        buildGraph(node.left, node, graph);
        buildGraph(node.right, node, graph);
      }
    }
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
