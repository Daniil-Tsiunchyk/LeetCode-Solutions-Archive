import java.util.ArrayList;
import java.util.List;

public class Problem_872 {

  public static void main(String[] args) {
    TreeNode root1Ex2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode root2Ex2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

    System.out.println(Solution.leafSimilar(root1Ex2, root2Ex2));
  }

  static class Solution {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
      List<Integer> leaves1 = new ArrayList<>();
      List<Integer> leaves2 = new ArrayList<>();
      collectLeaves(root1, leaves1);
      collectLeaves(root2, leaves2);
      return leaves1.equals(leaves2);
    }

    private static void collectLeaves(TreeNode node, List<Integer> leaves) {
      if (node == null) {
        return;
      }
      if (node.left == null && node.right == null) {
        leaves.add(node.val);
      } else {
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
      }
    }
  }

  public static class TreeNode {

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
