package string;

import java.util.ArrayList;

/**
 * @program: SolutionString5
 * @description: Solution string 5 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/14
 **/
public class SolutionString5 {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char c : chars) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                arrayList.add(c);
            }
        }
        for (int i = 0; i < arrayList.size() / 2; i++) {
            if (arrayList.get(i) != arrayList.get(arrayList.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
