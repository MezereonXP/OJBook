package string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Solution383
 * @Description 赎金信
 * @Author User
 * @Date 2019/3/23 1:12
 * @Version 1.0
 **/
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.toCharArray().length; i++) {
            if (magazine.indexOf(ransomNote.charAt(i)) == -1) {
                return false;
            } else {
                char[] temp = magazine.toCharArray();
                temp[magazine.indexOf(ransomNote.charAt(i))] = '*';
                magazine = String.valueOf(temp);
            }
        }
        return true;
    }
}
