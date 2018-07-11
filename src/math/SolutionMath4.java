package math;

/**
 * @program: SolutionMath4
 * @description: Solution math 4 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/11
 **/
public class SolutionMath4 {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i != s.length() - 1 && s.charAt(i + 1) != 'I') {
                        value--;
                    } else {
                        value++;
                    }
                    break;
                case 'X':
                    if (i != s.length() - 1 && ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C') || (s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
                        value -= 10;
                    } else {
                        value += 10;
                    }
                    break;
                case 'V':
                    if (i != s.length() - 1 && (s.charAt(i + 1) != 'I' && s.charAt(i + 1) != 'V')) {
                        value -= 5;
                    } else {
                        value += 5;
                    }
                    break;
                case 'L':
                    if (i != s.length() - 1 && ((s.charAt(i + 1) == 'C') || (s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
                        value -= 50;
                    } else {
                        value += 50;
                    }
                    break;
                case 'C':
                    if (i != s.length() - 1 && ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
                        value -= 100;
                    } else {
                        value += 100;
                    }
                    break;
                case 'D':
                    if (i != s.length() - 1 && ((s.charAt(i + 1) == 'M'))) {
                        value -= 500;
                    } else {
                        value += 500;
                    }
                    break;
                case 'M':
                    value += 1000;
                    break;
            }
        }
        return value;
    }
}
