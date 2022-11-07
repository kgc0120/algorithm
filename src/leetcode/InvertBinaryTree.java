package leetcode;

/**
 * @author bumblebee
 *
 * 226. Invert Binary Tree
 */
public class InvertBinaryTree {


    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();

        TreeNode treeNodeLeft = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode treeNodeRight = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        TreeNode binaryTree = new TreeNode(4, treeNodeLeft, treeNodeRight);

        System.out.println(invertTree(binaryTree));
    }

    public static TreeNode invertTree(TreeNode root) {

        if(root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invertTree(root.left);
        node.val = root.val;
        node.left = invertTree(root.right);
        return node;

    }
}
