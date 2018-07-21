package dp;

/**
 * @program: SolutionDP6
 * @description: Solution DP 6 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionDP6 {

    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int count = getPath(1, 1, m, n);
        return count;
    }

    public int getPath(int x, int y, int m, int n) {
        int count = 0;
        if ((x == m - 1 && y == n) || (x == m && y == n - 1)) {
            return 1;
        }
        if (x < m) {
            count += getPath(x + 1, y, m, n);
        }
        if (y < n) {
            count += getPath(x, y + 1, m, n);
        }
        return count;
    }

    public int uniquePaths2(int m, int n) {
        int[][] p = new int[m + 1][n + 1];
        if (m == 1 || n == 1) {
            return 1;
        }
        for (int i = 1; i <= m; i++) {
            p[i][n] = 1;
        }
        for (int i = 1; i <= n; i++) {
            p[m][i] = 1;
        }
        for (int i = m - 1; i >= 1; i--) {
            int t = m - i;
            if (n - t >= 0) {
                p[i][n - t] = p[i + 1][n - t] + p[i][n - t + 1];
                for (int j = i - 1; j >= 1; j--) {
                    p[j][n - t] = p[j + 1][n - t] + p[j][n - t + 1];
                }
                for (int j = n - t - 1; j >= 1; j--) {
                    p[i][j] = p[i + 1][j] + p[i][j + 1];
                }
            }
        }
        return p[1][1];
    }

}
