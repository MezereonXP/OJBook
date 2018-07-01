package string;

/**
 * @program: OJBook
 * @description: Solution for string 4 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-11 17:35
 **/
public class SolutionString4 {

    public boolean isAnagram(String s, String t) {
        int[] note1 = new int[26];
        int[] note2 = new int[26];
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        if (chars1.length != chars2.length) {
            return false;
        }
        for (int i = 0; i < chars2.length; i++) {
            note1[chars1[i] - 'a']++;
            note2[chars2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (note1[i] != note2[i]) {
                return false;
            }
        }
        return true;
    }
}
