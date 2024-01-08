package Task_938;

import static Task_938.Solution.rangeSumBST;

public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(7);
        root1.right.right = new TreeNode(18);
        System.out.println(rangeSumBST(root1, 7, 15));

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(15);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(7);
        root2.left.left.left = new TreeNode(1);
        root2.left.right.left = new TreeNode(6);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(18);
        System.out.println(rangeSumBST(root2, 6, 10));
    }
}
