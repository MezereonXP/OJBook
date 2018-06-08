package stack;

/**
 * @program: Solution5
 * @description: Solution5
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/8
 **/
public class Solution5 {
    public String longestPalindrome(String s) {
        String re1 = getString1(s);
        String re2 = getString2(s);
        return re1.length()>re2.length()?re1:re2;
    }

    private String getString2(String s) {
        char[] chars = s.toCharArray();
        int maxLength1 = 1;
        int p1 = 0;
        String result1 = "";
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            int position = 0;
            for (int j = i + 1; j < chars.length; j++) {
                if ((i + position) < 0) {
                    break;
                } else if ((i + position) >= 0 && chars[i+position] == chars[j]){
                    count += 2;
                    position--;
                } else if ((i + position) >= 0 && chars[i+position] != chars[j]){
                    break;
                }
            }
            if (count>maxLength1){
                maxLength1 = count;
                p1 = i;
            }
        }
        for (int i=0;i<(maxLength1)/2;i++){
            result1 = chars[p1-i]+result1+chars[p1+i+1];
        }

        return result1;
    }

    public String getString1(String s){
        char[] chars = s.toCharArray();
        int maxLength1 = 1;
        int p1 = 0;
        String result1 = "";
        for (int i = 1; i < chars.length; i++) {
            int count = 1;
            int position = 1;
            for (int j = i - 1; j >= 0; j--) {
                if ((i + position) < chars.length&&chars[j] != chars[i + position]) {
                    break;
                } else if ((i + position) >= chars.length) {
                    break;
                } else if ((i + position) < chars.length && chars[j] == chars[i + position]){
                    count += 2;
                    position++;
                }
            }
            if (count>maxLength1){
                maxLength1 = count;
                p1 = i;
            }
        }
        result1 += chars[p1];
        for (int i=1;i<=(maxLength1-1)/2;i++){
            result1 = chars[p1+i]+result1+chars[p1+i];
        }

        return result1;
    }
}
