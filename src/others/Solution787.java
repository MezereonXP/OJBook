package others;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Solution787
 * @Description K 站中转内最便宜的航班
 * @Author User
 * @Date 2019/3/25 17:03
 * @Version 1.0
 **/
public class Solution787 {

    public static void main(String[] args) {
        int[][] data = {{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}};
        System.out.printf("" + new Solution787().findCheapestPrice2(5, data, 0, 2, 2));
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
        LinkedList list = new LinkedList();

        int[] min = new int[n];
        int[] hops = new int[n];
        int[] visit = new int[n];
        int count = 0, count2 = 0;
        int k = 0;
        // 初始化
        for (int i = 0; i < flights.length; i++) {
            if (flights[i][0] == src) {
                list.addLast(flights[i][1]);
                min[flights[i][1]] = flights[i][2];
                hops[flights[i][1]] = 1;
                count++;
            }
        }
        while (!list.isEmpty()) {
            if (k >= K)
                break;
            int temp = (int) list.getFirst();
            count--;
            if (count == 0) {
                k++;
                count = count2;
                count2 = 0;
            }
            // 延伸访问节点
            for (int i = 0; i < flights.length; i++) {
                if (flights[i][0] == temp) {
                    if (visit[flights[i][1]] == 0)
                        list.addLast(flights[i][1]);
                    if (min[temp] != 0 && min[flights[i][1]] != 0)
                        if (hops[temp] < K || (hops[temp] == K && flights[i][1] == dst)) {
                            hops[flights[i][1]] = (min[flights[i][1]] > min[temp] + flights[i][2]) ? hops[temp] + 1 : hops[flights[i][1]];
                            min[flights[i][1]] = Math.min(min[flights[i][1]], min[temp] + flights[i][2]);
                        }
                    if (min[temp] != 0 && min[flights[i][1]] == 0) {
                        if (hops[temp] < K || (hops[temp] == K && flights[i][1] == dst)) {
                            min[flights[i][1]] = min[temp] + flights[i][2];
                            hops[flights[i][1]] = hops[temp] + 1;
                        }
                    }
                    count2++;
                }
            }
            visit[temp] = 1;
            list.removeFirst();
        }
        return min[dst] == 0 ? -1 : min[dst];
    }
}
