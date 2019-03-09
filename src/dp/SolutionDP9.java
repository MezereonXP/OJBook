package dp;

/**
 * @ClassName SolutionDP9
 * @Description DP
 * @Author User
 * @Date 2019/3/9 18:13
 * @Version 1.0
 **/
public class SolutionDP9 {

    public static void main(String[] args) {
        System.out.printf("" + digitCounts(1, 700));
    }

    public static int digitCounts(int k, int n) {
        // write your code here
        char[] s = (n + "").toCharArray();
        int[] count = new int[s.length];
        if (n >= k)
            count[0] = 1;
        else
            return 0;
        for (int i = count.length - 2; i >= 0; i--) {
            if (i != 0) {
                // 不是最高位
                count[i] = 9 * count[i + 1] + (int) Math.pow(10, count.length - i - 1) + count[i + 1];
            } else {
                //是最高位
                if (k > Integer.parseInt(s[i] + "")) {
                    count[i] = Integer.parseInt(s[i] + "") * count[i + 1];
                } else {
                    count[i] = (Integer.parseInt(s[i] + "") - 2) * count[i + 1] + (int) Math.pow(10, count.length - i - 1) + count[i + 1];
                }
            }
        }
        return count[0];
    }
}
