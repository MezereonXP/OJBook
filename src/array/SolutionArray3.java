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
        if (shift == 0) {
            return;
        }
        rotateWithRecursive(nums, 0, nums.length - 1, shift);
    }

    public void rotateWithRecursive(int[] nums, int start, int end, int k) {

        int shift = - end + start + 2*k - 1;
        if (2*k == nums.length && nums.length%2 == 0){
            for (int i = start; i < k; i++) {
                int temp = nums[i];
                nums[i] = nums[i+k];
                nums[i+k] = temp;
            }
        }

        if (2*k < nums.length){
            for (int i = start; i < end - start - k + 1; i++) {
                int temp = nums[i];
                nums[i] = nums[i+k];
                nums[i+k] = temp;
            }
            rotateWithRecursive(nums, start + k, end, shift);
        }

        if (2*k > nums.length){
            for (int i = start; i < end - start - k + 1; i++) {
                int temp = nums[i];
                nums[i] = nums[i+k];
                nums[i+k] = temp;
            }
            rotateWithRecursive(nums, start, start + k - 1, shift);
        }
    }
}
