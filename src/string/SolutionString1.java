package string;

import java.util.Arrays;

/**
 * @program: OJBook
 * @description: Solution for string 1 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-11 15:48
 **/
public class SolutionString1 {
    public String reverseString(String s) {
        String result = new StringBuffer(s).reverse().toString();
        return result;
    }
}
