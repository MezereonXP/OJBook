package array;

/**
 * @program: SolutionArray8
 * @description: Solution for array 5 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray8 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length - count; j++) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
                count++;
            }
        }
    }
}
