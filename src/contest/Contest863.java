package contest;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Contest863
 * @description: Contest 863
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/22
 **/
public class Contest863 {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> list = new ArrayList<>();
        //搜索target以下的节点
        search(target, K, 0, list);
        int i = getLengthForTarget(root, target, 0);
        if (K >= i) {
            search(root, K - i, 0, list);
        }
        return list;
    }

    private int getLengthForTarget(TreeNode root, TreeNode target, int i) {
        if (root == null) {
            return 0;
        }
        if (root.val != target.val) {
            return getLengthForTarget(root.right, target, i + 1) + getLengthForTarget(root.left, target, i + 1);
        } else {
            return i;
        }
    }

    private void search(TreeNode target, int k, int i, List<Integer> list) {
        if (target == null) {
            return;
        }
        if (k > i) {
            search(target.left, k, i + 1, list);
            search(target.right, k, i + 1, list);
        } else {
            if (list.indexOf(target.val) == -1) {
                list.add(target.val);
            }
        }
    }
}
