package string;

/**
 * @program: OJBook
 * @description: Solution for string 8 on leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-26 09:23
 **/
public class SolutionString8 {
    public String longestCommonPrefix(String[] strs) {
        int position = 0;
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        int minLength = getMinLength(strs);
        int flag = 1;
        String result = "";
        while (position < minLength) {
            char temp = strs[0].charAt(position);
            for (int i = 1; i < strs.length; i++) {
                if (temp != strs[i].charAt(position)) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                result += temp;
                position++;
            } else {
                break;
            }
        }
        return result;
    }

    private int getMinLength(String[] strs) {
        int min = strs[0].length();
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        return min;
    }
}
