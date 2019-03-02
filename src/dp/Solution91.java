package dp;

public class Solution91 {
    public static void main(String[] args) {
        String s = "10";
        System.out.printf(""+numDecodings(s));
    }

    public static int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int[] memo = new int[chars.length+1];
        for (int i = chars.length - 1; i >= 0 ; i--) {
            if (i == 0 && chars[i] == '0'){
                memo[i] =  0;
                continue;
            }
            if (i == chars.length - 2) {
                if (chars.length > 1 && chars[i] < '3' && chars[i] > '0') {
                    if (chars[i+1] == '0' || (chars[i+1] >= '7') && chars[i] == '2'){
                        memo[i] =  1;
                        continue;
                    }
                    memo[i] = 2;
                    continue;
                }
                if (chars[i] == '0'|| chars[i+1] == '0'){
                    memo[i] = 0;
                    continue;
                }
                memo[i] = 1;
                continue;
            }
            if (i == chars.length - 1) {
                if (chars[i] != '0') {
                    memo[i] = 1;
                    continue;
                } else if (chars.length > 1 && chars[i-1] >= '3') {
                    memo[i] = 0;
                    continue;
                }
            }
            if (i > chars.length - 1) {
                memo[i] = 0;
                continue;
            }
            if (chars[i] - '0' > 0 && chars[i] - '0' <= 2 ) {
                if (i < chars.length - 1 && ((chars[i] == '2' && chars[i+1] - '6' <= 0)|| chars[i] == '1')) {
                    memo[i] = memo[i + 1] + memo[i + 2];
                    continue;
                }
                memo[i] = memo[i+1];
                continue;
            }
            if (chars[i] >= '3') {
                memo[i] = memo[i + 1];
                continue;
            }
            if (chars[i] == '0'){
                memo[i] =  0;
                continue;
            }
            memo[i] = memo[i+1];
            continue;
        }
        count = memo[0];
        return count;
    }

    private static int getCountFormStr(char[] s, int i) {
        if (i == 0 && s[i] == '0')
            return 0;
        if (i == s.length - 2) {
            if (s.length > 1 && s[i] < '3' && s[i] > '0') {
                if (s[i+1] == '0' || (s[i+1] >= '7') && s[i] == '2')
                    return 1;
                return 2;
            }
            if (s[i] == '0'|| s[i+1] == '0')
                return 0;
            return 1;
        }
        if (i == s.length - 1) {
            if (s[i] != '0') {
                return 1;
            } else if (s.length > 1 && s[i-1] >= '3') {
                return 0;
            }
        }
        if (i > s.length - 1)
            return 0;
        if (s[i] - '0' > 0 && s[i] - '0' <= 2 ) {
            if (i < s.length - 1 && ((s[i] == '2' && s[i+1] - '6' <= 0)|| s[i] == '1'))
                return getCountFormStr(s, i+1) + getCountFormStr(s, i+2);
            return getCountFormStr(s, i+1);
        }
        if (s[i] >= '3')
            return getCountFormStr(s, i+1);
        if (s[i] == '0')
            return 0;
        return getCountFormStr(s, i+1);
    }

}
