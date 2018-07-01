package string;

/**
 * @program: OJBook
 * @description: Solution for string 2 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-11 15:56
 **/
public class SolutionString2 {
    public int reverse(int x) {
        int flag = 0;
        String s = x + "";
        if (x < 0) {
            flag = 1;
            s = s.substring(1);
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[s.length() - 1 - i];
            chars[s.length() - 1 - i] = temp;
        }
        try {
            Integer integer = new Integer(String.valueOf(chars));
            if (flag == 1) {
                integer *= -1;
            }
            return integer;
        } catch (Exception e) {
            return 0;
        }

    }
}
