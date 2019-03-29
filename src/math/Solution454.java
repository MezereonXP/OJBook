package math;

import java.util.Arrays;

/**
 * @ClassName Solution454
 * @Description 四数相加
 * @Author User
 * @Date 2019/3/29 15:03
 * @Version 1.0
 **/
public class Solution454 {
    public static void main(String[] args) {
        Solution454 solution454 = new Solution454();
        int[][] data = {{1, 2}, {-2, -1}, {-1, 2}, {0, 2}};
        solution454.fourSumCount(data[0], data[1], data[2], data[3]);
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null)
            return 0;
        int[] AB = new int[A.length * B.length];
        int[] CD = new int[A.length * B.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                AB[count] = A[i] + B[j];
                CD[count++] = -C[i] - D[j];
            }
        }
        Arrays.sort(AB);
        Arrays.sort(CD);
        count = 0;
        for (int i = 0; i < AB.length; i++) {
            int position = Arrays.binarySearch(CD, AB[i]);
            if (position >= 0)
                count += getCount(CD, AB[i], position);
        }
        return count;

    }

    private int getCount(int[] cd, int v, int position) {
        int count = 1;
        for (int j = position + 1; j < cd.length; j++) {
            if (cd[j] == v) {
                count++;
            } else {
                break;
            }
        }
        for (int i = position - 1; i >= 0; i--) {
            if (cd[i] == v) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
