package tree;

/**
 * @program: SolutionTree5
 * @description: Solution tree 5 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/3
 **/
public class SolutionTree5 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);// 3/2 = 1, 5/2 = 2 that is the middle position
        createBST(root, nums, nums.length / 2 + 1, nums.length - 1, 1);
        createBST(root, nums, 0, nums.length / 2 - 1, 2);
        return root;
    }

    private void createBST(TreeNode node, int[] nums, int start, int end, int flag) {
        int length = end - start + 1;
        if (start > end) {
            return;
        }
        if (flag == 1) {
            node.right = new TreeNode(nums[start + length / 2]);
        } else {
            node.left = new TreeNode(nums[start + length / 2]);
        }
        if (start < end) {
            createBST(flag == 1 ? node.right : node.left, nums, start + length / 2 + 1, end, 1);
            createBST(flag == 1 ? node.right : node.left, nums, start, start + length / 2 - 1, 2);
        }
    }
}
