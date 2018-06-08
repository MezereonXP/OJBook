package dp;

/**
 * @program: OJBook
 * @description: Solution for dp 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 17:12
 **/
public class SolutionDP3 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxPosition = 0, minPosition = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < min) {
                min = sum;
                minPosition = i;
            }
        }
        sum = 0;
        maxPosition = -1;
        for (int i=0;i< nums.length;i++){
            sum += nums[i];
            if (sum > max && i > minPosition) {
                max = sum;
                maxPosition = i;
            }
        }
        if (maxPosition == -1){
            sum = 0;
            max = Integer.MAX_VALUE;
            for (int i=0;i< nums.length;i++){
                sum += nums[i];
                if (sum < max && i < minPosition) {
                    max = sum;
                    maxPosition = i;
                }
            }
        }
        int result = maxPosition > minPosition ? (max - min) : (min - max);
        return result>nums[0]?result:nums[0];
    }
}
