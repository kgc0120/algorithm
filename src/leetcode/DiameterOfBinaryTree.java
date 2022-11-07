package leetcode;

import com.sun.source.tree.Tree;

/**
 * @author bumblebee
 *
 * 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {

        TreeNode leftTree = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode rightTree = new TreeNode(3);
        TreeNode root = new TreeNode(1, leftTree, rightTree);

        System.out.println(diameterOfBinaryTree(root));
    }

    static int result = -1;

    public static int diameterOfBinaryTree(TreeNode root) {

        dfs(root);
        return result;
    }

    private static int dfs(TreeNode current) {
        if (current == null) {
            return -1;
        }
        int left = 1 + dfs(current.left);
        int right = 1 + dfs(current.right);
        result = Math.max(result, (left + right));
        return Math.max(left, right);
    }
}
