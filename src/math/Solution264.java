package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Solution264
 * @Description TODO
 * @Author User
 * @Date 2019/3/17 16:17
 * @Version 1.0
 **/
public class Solution264 {

    public static void main(String[] args) {
        Solution264 solution264 = new Solution264();
        System.out.printf("" + solution264.nthUglyNumber(384));
    }

    public int nthUglyNumber(int n) {
        if (n <= 6)
            return n;
        int[] isUgly = new int[399999999];
        int count = 4;
        isUgly[1] = 1;
        isUgly[2] = 2;
        isUgly[3] = 3;
        isUgly[5] = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (isUgly[i] * isUgly[j] < 399999999 && isUgly[isUgly[i] * isUgly[j]] == 0) {
                    isUgly[isUgly[i] * isUgly[j]] = isUgly[i] * isUgly[j];
                }
            }
        }
        int position = 0;
        count = 0;
        while (count != n) {
            if (isUgly[position] != 0) {
                count++;
            }
            position++;
        }
        return (int) isUgly[position - 1];
    }
}
