package math;

/**
 * @ClassName Solution883
 * @Description Solution 883 for leetcode
 * @Author User
 * @Date 2019/3/22 19:52
 * @Version 1.0
 **/
class Solution883 {
    public int projectionArea(int[][] grid) {
        //侧视图计算
        int s1 = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[i][j]);
            }
            s1 += max;
        }
        //正视图计算
        int s2 = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            s2 += max;
        }
        //俯视图计算
        int s3 = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != 0)
                    s3++;
            }
        }
        return s1 + s2 + s3;
    }
}
