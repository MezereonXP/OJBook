package tree;

/**
 * @program: SolutionTree3
 * @description: Solution tree 3 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/2
 **/
public class SolutionTree3 {

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            return compare(root.left, root.right);
        }
        return true;
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        } else {
            return compare(left.left, right.right) && compare(left.right, right.left);
        }
    }
}
