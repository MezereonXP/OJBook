package tree;

/**
 * @program: SolutionTree2
 * @description: Solution tree 2 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/1
 **/
public class SolutionTree2 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root) && isValid2(root);
    }

    private boolean isValid2(TreeNode root) {
        boolean left = true, right = true;
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            left = root.val > compare(root.left, 1);
        }
        if (root.right != null) {
            right = root.val < compare(root.right, 2);
        }
        if (left && right) {
            return isValid2(root.left) && isValid2(root.right);
        }
        return false;
    }

    private int compare(TreeNode node, int flag) {
        int initValue = flag == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int left = initValue, right = initValue;
        if (node.left == null && node.right == null) {
            return node.val;
        }
        if (node.left != null) {
            left = compare(node.left, flag);
        }
        if (node.right != null) {
            right = compare(node.right, flag);
        }
        return flag == 1 ? Math.max(left, right) : Math.min(left, right);
    }

    private boolean isValid(TreeNode root) {
        boolean left = true, right = true;
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            left = root.left.val < root.val;
        }
        if (root.right != null) {
            right = root.right.val > root.val;
        }
        if (left && root.left != null) {
            left = isValid(root.left);
        }
        if (right && root.right != null) {
            right = isValid(root.right);
        }
        return left && right;
    }
}
