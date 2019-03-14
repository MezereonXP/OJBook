package string;

import java.util.Arrays;

/**
 * @ClassName Solution87
 * @Description Leetcode87
 * @Author User
 * @Date 2019/3/10 13:46
 * @Version 1.0
 **/
public class Solution87 {

    public static void main(String[] args) {
        String s1 = "great";
        String s2 = "rgeat";
        System.out.printf(String.valueOf(isScramble(s1, s2)));
    }

    public static boolean isScramble(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] history = new int[chars1.length];
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < chars1.length; i++) {
            char temp = chars1[i];
            if (temp == chars2[i]) {
                continue;
            }
            chars2 = getString(temp, chars2, i, history);
            if (temp != chars2[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] getString(char s, char[] chars, int position, int[] history) {
        char[] result = new char[chars.length];
        for (int i = 0; i < position; i++) {
            result[i] = chars[i];
        }
        int shift = 0, count = 0, flag = 0;
        for (int i = position; i < chars.length; i++) {
            if (chars[i] == s) {
                if (!check(history, position, i))
                    return chars;
                result[shift + position] = chars[i];
                shift = i;
                flag = 1;
                break;
            }
        }
        if (flag != 1)
            return chars;
        for (int j = shift + 1; j < chars.length; j++) {
            count++;
            result[position + count] = chars[j];
        }
        history[position + count] = 1;
        for (int i = position; i < shift; i++) {
            result[position + count + 1] = chars[i];
            count++;
        }
        return result;
    }

    private static boolean check(int[] history, int position, int i) {
        for (int j = position; j < i; j++) {
            if (history[j] == 1)
                return false;
        }
        return true;
    }
}
