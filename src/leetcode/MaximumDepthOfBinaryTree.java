package leetcode;

/**
 * @author bumblebee
 *
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        TreeNode leftTreeNode = new TreeNode(9);
        TreeNode rightTreeNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode = new TreeNode(3, leftTreeNode, rightTreeNode);

        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
