package tree;

import java.util.LinkedList;

/**
 * @ClassName Solution958
 * @Description 二叉树的完全性检验
 * @Author User
 * @Date 2019/3/28 22:59
 * @Version 1.0
 **/
public class Solution958 {
    public boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList<>();
        if (root == null)
            return true;
        nodes.addLast(root);
        boolean flag = false;
        while (!nodes.isEmpty()) {
            TreeNode temp = nodes.poll();
            if (temp == null)
                flag = true;
            if (temp != null && flag)
                return false;
            if (temp != null) {
                nodes.add(temp.left);
                nodes.add(temp.right);
            }
        }
        return true;
    }
}
