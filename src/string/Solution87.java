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
        String s1 = "oatzzffqpnwcxhejzjsnpmkmzngneo";
        String s2 = "acegneonzmkmpnsjzjhxwnpqffzzto";
        System.out.printf(String.valueOf(isScramble(s1, s2)));
    }

    public static boolean isScramble(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] history = new int[chars1.length];
        if (s1.equals(s2))
            return true;
        if (s1.length() != s2.length())
            return false;
        // 从第一个字母选取开始，尝试的进行分割
        for (int i = 0; i < chars1.length - 1; i++) {
            if (divide(chars1.clone(), chars2.clone(), i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 尝试性的进行分割，如果左边部分和右边部分都满足是第一个字符数组的排列即可
     *
     * @param chars1 第一个字符数组
     * @param chars2 第二个字符数组
     * @param i      位置
     * @return
     */
    private static boolean divide(char[] chars1, char[] chars2, int i) {
        boolean isRight = true;
        boolean isRight2 = true;
        boolean tempResult = false;
        String s11 = "", s12 = "", s21 = "", s22 = "";

        //check正常顺序
        char[] copy = chars2.clone();
        for (int j = 0; j < chars1.length; j++) {
            char tempChar = chars1[j];
            if (j <= i) {
                s11 = s11 + chars1[j];
                s21 = s21 + chars2[j];
                for (int k = 0; k <= i; k++) {
                    if (copy[k] == tempChar) {
                        copy[k] = '*';
                        break;
                    }
                }
            } else {
                s12 = s12 + chars1[j];
                s22 = s22 + chars2[j];
                for (int k = i + 1; k < chars1.length; k++) {
                    if (copy[k] == tempChar) {
                        copy[k] = '*';
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < chars1.length; j++) {
            if (copy[j] != '*') {
                isRight = false;
                break;
            }
        }
        if (isRight) {
            tempResult = isScramble(s11, s21) && isScramble(s12, s22);
        }
        //check交换后的顺序
        copy = chars2.clone();
        for (int j = i + 1; j < copy.length; j++) {
            chars2[j - i - 1] = copy[j];
        }
        for (int j = 0; j <= i; j++) {
            chars2[chars1.length - i + j - 1] = copy[j];
        }
        copy = chars2.clone();
        s11 = "";
        s12 = "";
        s21 = "";
        s22 = "";
        i = chars1.length - i - 2;

        for (int j = 0; j < chars1.length; j++) {
            char tempChar = chars1[j];
            if (j <= i) {
                s11 = s11 + chars1[j];
                s21 = s21 + chars2[j];
                for (int k = 0; k <= i; k++) {
                    if (copy[k] == tempChar) {
                        copy[k] = '*';
                        break;
                    }
                }
            } else {
                s12 = s12 + chars1[j];
                s22 = s22 + chars2[j];
                for (int k = i + 1; k < chars1.length; k++) {
                    if (copy[k] == tempChar) {
                        copy[k] = '*';
                        break;
                    }
                }
            }
        }
        for (int j = 0; j <= i; j++) {
            if (copy[j] != '*') {
                isRight2 = false;
                break;
            }
        }
        if (isRight2) {
            return (isScramble(s11, s21) && isScramble(s12, s22)) || tempResult;
        } else {
            return tempResult;
        }
    }
}
