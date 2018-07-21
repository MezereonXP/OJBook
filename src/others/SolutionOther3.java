package others;

import java.util.Arrays;

/**
 * @program: SolutionOther3
 * @description: Solution other 3 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionOther3 {
    // you need treat n as an unsigned value
    public long reverseBits(int n) {
        int[] data = new int[32];
        Arrays.fill(data, 0);
        int position = 0;
        while (n != 0 && position < data.length) {
            if ((n & 1) == 1) {
                data[position] = 1;
            }
            n >>= 1;
            position++;
        }
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                result = result | 1;
            }
            if (i != (data.length - 1)) {
                result <<= 1;
            }
        }
        return result;
    }
}
