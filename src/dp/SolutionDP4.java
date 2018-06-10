package dp;

/**
 * @program: SolutionDP4
 * @description: Solution dp 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/10
 **/
public class SolutionDP4 {

    public int rob(int[] nums) {
        int[] note = new int[nums.length];
        if (nums.length == 0){
            return 0;
        }
        for (int start=nums.length-1;start>=0;start--){
            if (start+3<=nums.length-1) {
                note[start] = Math.max(nums[start] + note[start + 2], nums[start + 1] + note[start + 3]);
            } else if (start+2 == nums.length - 1){
                note[start] = Math.max(nums[start]+nums[start+2], nums[start+1]);
            } else if (start+1 == nums.length - 1){
                note[start] = Math.max(nums[start], nums[start+1]);
            } else if (start == nums.length - 1){
                note[start] = nums[start];
            } else {
                note[start] = 0;
            }
        }
        return note[0];
    }
}
