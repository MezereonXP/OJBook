package contest;

/**
 * @program: Contest860
 * @description: Contest 860
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/22
 **/
public class Contest860 {

    public boolean lemonadeChange(int[] bills) {
        int count = 0;
        int countTen = 0;
        for (int i = 0; i < bills.length; i++) {
            int backCount = (bills[i] - 5) / 5;
            if (backCount == 0) {
                count++;
                continue;
            }
            if (bills[i] == 20) {
                if (count >= 1 && countTen >= 1) {
                    count--;
                    countTen--;
                } else if (count >= 3) {
                    count -= 3;
                } else {
                    return false;
                }
            }
            if (bills[i] == 10) {
                if (count >= 1) {
                    count--;
                } else {
                    return false;
                }
                countTen++;
            }
        }
        return true;
    }
}
