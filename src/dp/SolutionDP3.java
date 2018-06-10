package dp;

import java.net.Inet4Address;
import java.util.ArrayList;

/**
 * @program: OJBook
 * @description: Solution for dp 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 17:12
 **/
public class SolutionDP3 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum>max){
                max = sum;
            }
            if (sum <= 0){
                sum = 0;
            }
        }
        return max;
    }
}
