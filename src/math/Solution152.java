package math;

/**
 * @ClassName Solution152
 * @Description Leetcode 152
 * @Author User
 * @Date 2019/3/15 22:58
 * @Version 1.0
 **/
public class Solution152 {

    public static void main(String[] args) {
        Solution152 solution152 = new Solution152();
        int[] data = {-2, 0, -1, -9};
        System.out.printf("" + solution152.maxProduct(data));
    }

    public int maxProduct(int[] nums) {
        int result = 1;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i];
            max = Math.max(max, nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0) {
                    result = 1;
                    break;
                } else {
                    result *= nums[j];
                    max = Math.max(max, result);
                }
            }
        }
        return max;
    }
}
