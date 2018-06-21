package string;

/**
 * @program: OJBook
 * @description: Solution for string 6 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-21 09:19
 **/
public class SolutionString6 {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        String s = "";
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                if (flag == 0) {
                    continue;
                } else {
                    break;
                }
            } else if ((c >= '0' && c <= '9')) {
                flag = (flag == 0) ? 1 : 1;
                s += c;
            } else if ((c == '-') || (c == '+')) {
                if (flag == 0) {
                    flag = 1;
                } else {
                    break;
                }
                s += c;
            } else {
                if (flag == 1) {
                    break;
                } else {
                    return 0;
                }
            }
        }
        if (flag == 1 && s.length() == 1 && (s.toCharArray()[0] == '-' || s.toCharArray()[0] == '+')) {
            return 0;
        }

        if (flag == 0) {
            return 0;
        }
        try {
            Integer integer = Integer.parseInt(s);
            return integer;
        } catch (Exception e) {
            return s.toCharArray()[0] == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

    }
}
