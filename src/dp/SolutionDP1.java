package dp;

/**
 * @program: OJBook
 * @description: Solution for dp 1 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 10:52
 **/
public class SolutionDP1 {
    public int climbStairs(int n) {
        int[] note = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                note[i] = 0;
            } else if (i == 1) {
                note[i] = 1;
            } else if (i == 2) {
                note[i] = 2;
            } else {
                note[i] = note[i - 1] + note[i - 2];
            }
        }
        return note[n];
    }
}
