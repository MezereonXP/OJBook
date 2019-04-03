package math;

/**
 * @ClassName Solution537
 * @Description 复数相乘
 * @Author User
 * @Date 2019/4/3 22:10
 * @Version 1.0
 **/
public class Solution537 {

    public static void main(String[] args) {
        Solution537 solution537 = new Solution537();
        solution537.complexNumberMultiply("1+1i", "2+1i");
    }

    public String complexNumberMultiply(String a, String b) {
        int realA = Integer.parseInt(a.split("\\+")[0]);
        int realB = Integer.parseInt(b.split("\\+")[0]);
        int real = realA * realB - Integer.parseInt(a.split("\\+")[1].split("i")[0])
                * Integer.parseInt(a.split("\\+")[1].split("i")[0]);
        return real + "+" + (realA + realB) + "i";
    }
}
