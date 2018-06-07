package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: SolutionArray5
 * @description: Solution for array 5 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/6
 **/
public class SolutionArray5 {
    public int singleNumber(int[] nums) {
        int windowSize = (nums.length + 1) / 2 + 1;
        for (int i = 0; i < nums.length - windowSize + 1; i++) {
            int count = windowSize;
            int j = 1;
            if (nums[i] == Integer.MAX_VALUE){
                continue;
            }
            while (count >= 0) {
                if (nums[i + j] == Integer.MAX_VALUE) {
                    j++;
                    continue;
                }
                if (nums[i] == nums[i + j]) {
                    nums[i] = Integer.MAX_VALUE;
                    nums[i + j] = Integer.MAX_VALUE;
                    break;
                }
                j++;
                count--;
            }
        }
        for (int n : nums) {
            if (n != Integer.MAX_VALUE) {
                return n;
            }
        }
        return nums[0];
    }
}
