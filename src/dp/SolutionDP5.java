package dp;

import java.util.Arrays;

/**
 * @program: SolutionDP5
 * @description: Solution dp  for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionDP5 {
    public boolean canJump(int[] nums) {
        int[] status = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                status[i] = 1;
            }
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j >= nums.length) {
                    break;
                }
                if (status[i + j] == 1) {
                    status[i] = 1;
                    break;
                }
            }
        }
        return status[0] == 1;
    }

    public boolean canJump2(int[] nums) {
        int position = 0;
        int nextPostion = -1, value = 0;
        while (position < nums.length - 1) {
            nextPostion = -1;
            value = 0;
            if (position + nums[position] >= nums.length - 1) {
                return true;
            }
            for (int i = 1; i <= nums[position]; i++) {
                if (position + i < nums.length) {
                    if (nums[position + i] >= nums.length - 1) {
                        return true;
                    }
                    if (value < (nums[position + i] + i)) {
                        nextPostion = position + i;
                        value = nums[nextPostion] + i;
                    }
                }
            }
            if (nextPostion == -1) {
                return false;
            }
            position = nextPostion;
        }
        return true;
    }

    public boolean canJump3(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int[] p = new int[nums.length];
        int currentPosition = 0;
        Arrays.fill(p, -1);
        p[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (p[i] == 1 && i + nums[i] >= nums.length - 1) {
                return true;
            }
            if (p[i] == 1 && currentPosition < i + nums[i]) {
                Arrays.fill(p, currentPosition, i + nums[i] + 1, 1);
                currentPosition = i + nums[i];
            }
        }
        return p[nums.length - 1] == 1;
    }
}
