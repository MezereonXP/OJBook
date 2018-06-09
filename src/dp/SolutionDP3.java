package dp;

/**
 * @program: OJBook
 * @description: Solution for dp 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 17:12
 **/
public class SolutionDP3 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int[] profit = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                profit[i] = nums[i];
                continue;
            }
            if (nums[i] < 0) {
                sum += nums[i];
                profit[i] = Math.max(profit[i - 1], nums[i]);
            } else if (nums[i] > 0) {
                sum += nums[i];
                profit[i] = Math.max(profit[i - 1], nums[i]);
                profit[i] = Math.max(profit[i], profit[i - 1] + sum);
                if (profit[i] == profit[i - 1] + sum || profit[i] == nums[i]) {
                    sum = 0;
                }
            }
        }
        return profit[nums.length - 1];
    }
}
