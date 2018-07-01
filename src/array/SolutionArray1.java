package array;/**
 * Created by Administrator on 2018/6/4.
 */

/**
 * @program: SolutionArray1
 * @description: Solution for array 1 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/4
 **/
public class SolutionArray1 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] == nums[i]) {
                continue;
            } else {
                nums[++count] = nums[i];
            }
        }
        return count + 1;
    }
}
