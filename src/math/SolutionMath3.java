package math;

/**
 * @program: SolutionMath3
 * @description: Solution math 3 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/9
 **/
public class SolutionMath3 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        double temp = Math.log(n) / Math.log(3);
        if (Math.abs(temp - (int) temp) < 1e-10 || (1 - Math.abs(temp - (int) temp)) < 1e-10) {
            return true;
        }
        return false;
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        int temp = n;
        while (temp != 1) {
            if (temp % 2 != 0) {
                return false;
            }
            temp = temp >> 1;
        }
        return true;
    }
}
