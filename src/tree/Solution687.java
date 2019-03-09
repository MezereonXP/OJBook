package tree;

/**
 * @program: Solution687
 * @description: Solution687 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2019/3/8
 **/
public class Solution687 {
    public static void main(String[] args) {

    }

    public static int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = search(root, root.val, 1) - 1;
        int left = 0, right = 0;
        if (root.left != null) {
            left = longestUnivaluePath(root.left);
        }
        if (root.right != null) {
            right = longestUnivaluePath(root.right);
        }
        return Math.max(Math.max(max, left), right);
    }

    public static int search(TreeNode node, int val, int isRoot) {
        int count = 0;
        if (node == null)
            return 0;
        if (node.val == val) {
            count += 1;
            if (isRoot == 1) {
                count += search(node.left, val, 0);
                count += search(node.right, val, 0);
            } else {
                count += Math.max(search(node.left, val, 0), search(node.right, val, 0));
            }
            return count;
        } else {
            return count;
        }
    }
}
