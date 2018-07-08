package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SolutionMath1
 * @description: Solution math 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/8
 **/
public class SolutionMath1 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String result = String.valueOf(i);
            int flag = 0;
            if (i % 3 == 0) {
                result = "Fizz";
                flag = 1;
            }
            if (i % 5 == 0) {
                result = flag == 1 ? (result + "Buzz") : "Buzz";
            }
            list.add(result);
        }
        return list;
    }
}
