package array;

import java.util.Arrays;

/**
 * @program: SolutionArray4
 * @description: Solution for array 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/6
 **/
public class SolutionArray4 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
