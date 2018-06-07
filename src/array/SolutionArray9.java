package array;

/**
 * @program: SolutionArray9
 * @description: Solution for array 9 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray9 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            result[0] = i;
            for (int j=i+1;j<nums.length;j++){
               if (nums[j] == temp){
                   result[1] = j;
                   return result;
               }
           }
        }
        return result;
    }
}
