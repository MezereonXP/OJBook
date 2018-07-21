package dp;

import java.util.Arrays;

/**
 * @program: SolutionDP7
 * @description: Solution dp 7 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/22
 **/
public class SolutionDP7 {

    public int coinChange(int[] coins, int amount) {
//        int[][] matrix = new int[amount+1][amount+1];
//        for (int i = 0; i <= amount; i++) {
//            for (int j = i+1; j <= amount; j++) {
//                if ( check(coins, i - j)){
//                    matrix[i][j] = 1;
//                }
//            }
//        }
        if (amount == 0) {
            return 0;
        }
        int[] d = new int[amount + 1];
        d[0] = 0;
        Arrays.fill(d, 9999999);

        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    d[i] = Math.min(d[i], d[i - coins[j]] + 1);
                }
            }
        }
        return d[amount] == 9999999 ? -1 : d[amount];
    }

    private boolean check(int[] coins, int i) {
        for (int j = 0; j < coins.length; j++) {
            if (coins[j] == i) {
                return true;
            }
        }
        return false;
    }
}
