package string;

/**
 * @program: OJBook
 * @description: Solution for string 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-11 17:20
 **/
public class SolutionString3 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] note = new int[26];
        for (int i = 0; i < chars.length; i++) {
            if (note[chars[i] - 'a'] == 1) {
                continue;
            } else {
                int flag = 0;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        note[chars[i] - 'a'] = 1;
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
