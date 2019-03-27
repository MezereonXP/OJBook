package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName Solution652
 * @Description 寻找重复的子数
 * @Author User
 * @Date 2019/3/27 21:59
 * @Version 1.0
 **/
public class Solution652 {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        if (root == null)
            return result;
        postOrder(root, new HashMap<>(), result);
        return result;
    }

    private String postOrder(TreeNode root, HashMap<String, Integer> map, List<TreeNode> result) {
        if (root == null)
            return "#";
        String s = root.val + "," + postOrder(root.left, map, result) + "," + postOrder(root.right, map, result);
        if (map.getOrDefault(s, 0) == 1)
            result.add(root);
        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;
    }
}
