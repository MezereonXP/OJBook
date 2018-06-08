package dp;

/**
 * @program: OJBook
 * @description: Solution for dp 2 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-08 13:09
 **/
public class SolutionDP2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int min = prices[0];
        int positionOfMin = 0;
        int[] note = new int[n];
        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                positionOfMin = i;
                min = prices[i];
            }
            if (i == 0) {
                note[i] = 0;
            } else if (i == 1) {
                note[i] = prices[1] > prices[0] ? prices[1] - prices[0] : 0;
            } else {

                note[i] = prices[i] - prices[positionOfMin] > note[i - 1] ? (prices[i] - prices[positionOfMin]) : note[i - 1];
            }
        }
        return note[n - 1];
    }

}
