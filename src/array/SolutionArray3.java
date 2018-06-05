package array;

/**
 * @program: SolutionArray3
 * @description: Solution for array 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/5
 **/

public class SolutionArray3 {
    public void rotate(int[] nums, int k) {
        int shift = k % nums.length;
        int length = nums.length;
        int currentPostion = 0;
        if (shift == 0) {
            return;
        }
        if (shift % 2 == 0) {
            shift--;
            for (int i = 0; i < length; i++) {
                int temp = nums[0];
                nums[0] = nums[(currentPostion + 1) % length];
                nums[(currentPostion + 1) % length] = temp;
                currentPostion = (currentPostion + 1) % length;
            }
        }
        currentPostion = 0;
        for (int i = 0; i < length; i++) {
            int temp = nums[0];
            nums[0] = nums[(currentPostion + shift) % length];
            nums[(currentPostion + shift) % length] = temp;
            currentPostion = (currentPostion + shift) % length;
        }

    }
}
