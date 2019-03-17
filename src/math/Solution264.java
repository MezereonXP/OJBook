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
        if (n == 1) return n;
        int[] num = new int[n];
        num[0] = 1;
        int x2 = 0;
        int x3 = 0;
        int x5 = 0;
        for (int i = 1; i < n; i++) {
            num[i] = Math.min(Math.min(num[x2] * 2, num[x3] * 3), num[x5] * 5);
            if (num[i] == num[x2] * 2) x2++;
            if (num[i] == num[x3] * 3) x3++;
            if (num[i] == num[x5] * 5) x5++;
        }
        return num[n - 1];
    }
}
