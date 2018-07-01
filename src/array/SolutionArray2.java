package array;

/**
 * @program: SolutionArray2
 * @description: Solution for array 2 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/5
 **/
public class SolutionArray2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
