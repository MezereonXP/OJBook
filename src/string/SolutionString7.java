package string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: OJBook
 * @description: Solution for string 7 on leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-22 14:19
 **/
public class SolutionString7 {

    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int position = 0;
        if (n.length == 0) {
            return 0;
        }
        if (n.length != 0 && h.length == 0) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
