package array;/**
 * Created by Administrator on 2018/6/7.
 */

/**
 * @program: Solution7
 * @description: Solution for array 7 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray7 {
    public int[] plusOne(int[] digits) {
        int flag = 0;
        int[] tempResult = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            int t = (digits[i] + flag) % 10;
            if ((digits[i] + flag) >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            tempResult[i + 1] = t;
        }
        if (flag == 1) {
            tempResult[0] = 1;
            return tempResult;
        } else {
            int[] result = new int[digits.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = tempResult[i + 1];
            }
            return result;
        }

    }
}
