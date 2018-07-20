package others;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.math.BigInteger;

/**
 * @program: SolutionOther1
 * @description: Solution other 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/12
 **/
public class SolutionOther1 {

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
