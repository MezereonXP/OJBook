package dp;

/**
 * @program: OJBook
 * @description: Solution for dp 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 17:12
 **/
public class SolutionDP3 {
    public int maxSubArray(int[] nums) {
        int[] note = new int[nums.length];
        int[] isToEnd = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                note[i] = nums[i];
            } else {
                if (isToEnd[i - 1] == 0) {
                    note[i] = Math.max(note[i - 1] + nums[i], nums[i]);
                    note[i] = Math.max(note[i], note[i - 1]);
                    isToEnd[i] = note[i] == note[i - 1] ? nums[i] : 0;
                } else {
                    note[i] = Math.max(note[i - 1], nums[i]);
                    note[i] = Math.max(note[i], isToEnd[i - 1] + nums[i]);
                    isToEnd[i] = note[i] == note[i - 1] ? Math.max(isToEnd[i - 1] + nums[i], nums[i]) : 0;
                }
            }
        }
        return note[nums.length - 1];
    }
}
