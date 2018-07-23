package dp;

import java.util.Arrays;

/**
 * @program: SolutionDP8
 * @description: Solution dp 8 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/22
 **/
public class SolutionDP8 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    d[i] = Math.max(d[i], d[j]);
                }
            }
            d[i]++;
            max = max < d[i] ? d[i] : max;
        }
        return max;
    }

    public int lengthOfLISBetter(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length];
        int[] g = new int[nums.length];
        Arrays.fill(g, Integer.MAX_VALUE);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = lowbound(g, nums[i]);
            d[i] = k;
            g[k] = nums[i];
            max = max < d[i] ? d[i] : max;
        }
        return max;
    }

    private int lowbound(int[] g, int num) {
        int position = g.length / 2;
        int prevPosition = position;
        while (true) {
            if (g[position] < num) {
                prevPosition = position;
                position += (g.length - position) / 2;
                continue;
            }
            if (position == 0) {
                return position;
            } else if (position == g.length - 1) {
                return position;
            }
            if (g[position - 1] >= num) {
                int temp = position;
                position -= Math.abs(position - prevPosition) / 2;
                prevPosition = temp;
            } else {
                return position;
            }
        }
    }
}
