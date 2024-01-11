class Problem_1026 {

  public static void main(String[] args) {
    TreeNode root2 = new TreeNode(
      1,
      null,
      new TreeNode(2, null, new TreeNode(0, new TreeNode(3), null))
    );

    System.out.println(maxAncestorDiff(root2));
  }

  public static int maxAncestorDiff(TreeNode root) {
    if (root == null) return 0;
    return helper(root, root.val, root.val);
  }

  private static int helper(TreeNode node, int currentMin, int currentMax) {
    if (node == null) return currentMax - currentMin;
    currentMin = Math.min(currentMin, node.val);
    currentMax = Math.max(currentMax, node.val);
    int left = helper(node.left, currentMin, currentMax);
    int right = helper(node.right, currentMin, currentMax);
    return Math.max(left, right);
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
