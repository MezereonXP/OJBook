package string;

/**
 * @ClassName Solution647
 * @Description 回文子串
 * @Author User
 * @Date 2019/3/24 20:22
 * @Version 1.0
 **/
public class Solution647 {
    public int countSubstrings(String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(j) == temp && check(s.substring(i, j + 1)))
                    count++;
            }
        }
        return count;
    }

    private boolean check(String substring) {
        char[] chars = substring.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1])
                return false;
        }
        return true;
    }
}
