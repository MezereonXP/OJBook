package others;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SolutionOther4
 * @description: Solution other 4 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/21
 **/
public class SolutionOther4 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> tempList = new ArrayList<>();
            int length = i + 1;
            tempList.add(0, 1);
            if (i == 0) {

            } else if (i == 1) {
                tempList.add(1);
            } else {
                for (int j = 0; j < resultList.get(i - 1).size() - 1; j++) {
                    tempList.add(resultList.get(i - 1).get(j) + resultList.get(i - 1).get(j + 1));
                }
                tempList.add(1);
            }
            resultList.add(tempList);
        }
        return resultList;
    }
}
