package others;

/**
 * @ClassName Solution787
 * @Description K 站中转内最便宜的航班
 * @Author User
 * @Date 2019/3/25 17:03
 * @Version 1.0
 **/
public class Solution787 {

    public static void main(String[] args) {
        int[][] data = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        System.out.printf("" + new Solution787().findCheapestPrice(3, data, 0, 2, 1));
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int cost = getCheapest(flights, src, dst, K + 1, 0);
        return cost;
    }

    private int getCheapest(int[][] flights, int src, int dst, int k, int cost) {
        int min = Integer.MAX_VALUE;
        if (src == dst && k >= 0)
            return cost;
        if (k < 0)
            return Integer.MAX_VALUE;
        for (int i = 0; i < flights.length; i++) {
            if (flights[i][0] == src)
                min = Math.min(min, getCheapest(flights, flights[i][1], dst, k - 1, cost + flights[i][2]));
        }
        return min;
    }

    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int K) {
        return 0;
    }
}
