package dp;

/**
 * @ClassName Solution674
 * @Description Leetcode 674
 * @Author User
 * @Date 2019/3/15 23:38
 * @Version 1.0
 **/
public class Solution674 {
    public static void main(String[] args) {
        Solution674 solution674 = new Solution674();
        int[] data = {2, 2, 2, 2};
        System.out.printf("" + solution674.findLengthOfLCIS(data));
    }

    public int findLengthOfLCIS(int[] nums) {
        int sum = 1;
        int max = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum++;
            } else {
                sum = 1;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
