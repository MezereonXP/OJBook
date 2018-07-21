package others;

/**
 * @program: SolutionOther6
 * @description: Solution other 6 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionOther6 {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[i] != nums.length) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[i] != nums.length) {
                return i;
            }
        }
        return nums.length;
    }
}
