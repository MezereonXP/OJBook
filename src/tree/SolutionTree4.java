package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SolutionTree4
 * @description: Solution tree 4 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/3
 **/
public class SolutionTree4 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        setInteger(result, root, 1);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).size() == 0) {
                result.remove(i);
            }
        }
        return result;
    }

    private void setInteger(List<List<Integer>> result, TreeNode root, int i) {
        List<Integer> list = new ArrayList<>();
        if (result.size() < i) {
            result.add(list);
        }
        list = result.get(i - 1);
        if (root != null) {
            list.add(root.val);
            setInteger(result, root.left, i + 1);
            setInteger(result, root.right, i + 1);
        }
    }
}
