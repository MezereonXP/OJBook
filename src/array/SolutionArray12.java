package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: SolutionArray12
 * @description: Solution array 12 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/10
 **/
public class SolutionArray12 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int require = -nums[i] - nums[j];
                if (nums[i] == 0 && nums[j] == 0) {
                    require = 0;
                }
                int index = Arrays.binarySearch(nums, j + 1, nums.length, require);
                if (index >= 0) {
                    int[] temp = new int[3];
                    temp[0] = nums[i];
                    temp[1] = nums[j];
                    temp[2] = nums[index];
                    Arrays.sort(temp); ;
                    String temps = temp[0] + ";" + temp[1] + ";" + temp[2] + ";";
                    if (!set.contains(temps)) {
                        ArrayList list = new ArrayList();
                        String s = "";
                        for (int l = 0; l < temp.length; l++) {
                            s += temp[l] + ";";
                            list.add(temp[l]);
                        }
                        set.add(s);
                        result.add(list);
                    }
                }
            }
        }
        return result;
    }
}
