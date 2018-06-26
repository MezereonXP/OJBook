package string;

/**
 * @program: SolutionString8
 * @description: Solution string 8 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/22
 **/
public class SolutionString8 {
    public String countAndSay(int n) {
        String temp = "1";
        for (int i = 1; i < n; i++) {
            temp = count(temp);
        }
        return temp;
    }

    public String count(String n) {
        char[] chars = n.toCharArray();
        if (chars.length == 0) {
            return "";
        }
        String result = "";
        char temp = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != temp) {
                result += count + "" + temp;
                count = 1;
                temp = chars[i];
            } else {
                count++;
            }
            if (i ==  chars.length - 1 ) {
                result += count + "" + temp;
            }
        }
        if (chars.length == 1){
            return "1"+temp;
        }
        return result;
    }
}
