package tree;

/**
 * @ClassName Solution951
 * @Description 翻转等价二叉树
 * @Author User
 * @Date 2019/3/26 15:26
 * @Version 1.0
 **/
public class Solution951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return false;
        if (root1 == null && root2 == null)// 都为空则相同
            return true;
        if (root1.val != root2.val)// 判断树的顶点是否相同
            return false;
        return (flipEquiv(root1.right, root2.right) && flipEquiv(root1.left, root2.left))
                || (flipEquiv(root1.right, root2.left) && flipEquiv(root1.left, root2.right));

    }
}
