package string;

/**
 * @ClassName Solution482
 * @Description 密钥格式化
 * @Author User
 * @Date 2019/3/30 16:26
 * @Version 1.0
 **/
public class Solution482 {
    public static void main(String[] args) {
        Solution482 solution482 = new Solution482();
        solution482.licenseKeyFormatting("2-5g-3-J", 2);
    }

    public String licenseKeyFormatting(String S, int K) {
        char[] chars = S.replace("-", "").toCharArray();
        StringBuilder result = new StringBuilder();
        int count = chars.length - chars.length / K * K;
        for (int i = 0; i < chars.length; i++) {
            if (i == count && i != 0)
                result.append("-");
            if (i != count && (i - count) % K == 0 && i != 0)
                result.append("-");
            result.append(Character.toUpperCase(chars[i]));
        }
        return result.toString();
    }
}
