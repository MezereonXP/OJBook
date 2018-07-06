package sort;

/**
 * @program: SortSolution2
 * @description: Solution sort 2 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/6
 **/
public class SortSolution2 {

    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int end = n;
        int start = 1;
        while (true) {
            int length = (end - start + 1);
            int middle = start + length / 2;
            if (length == 2) {
                return isBadVersion(start) ? start : end;
            }
            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle;
            }
        }
    }

    public boolean isBadVersion(int n) {
        return n >= 4;
    }
}
