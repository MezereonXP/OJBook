package others;

/**
 * @program: SolutionOther2
 * @description: Solution other 2 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionOther2 {

    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        return hammingWeight(temp);
    }

    public int hammingWeight(int n) {
        Integer integer = n;
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
