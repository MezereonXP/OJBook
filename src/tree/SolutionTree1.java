package tree;

/**
 * @program: SolutionTree1
 * @description: Solution tree 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/1
 **/
public class SolutionTree1 {
    public int maxDepth(TreeNode root) {
        int leftDepth = 0, rightDepth = 0;
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            leftDepth = maxDepth(root.left);
        }
        if (root.right != null) {
            rightDepth = maxDepth(root.right);
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
