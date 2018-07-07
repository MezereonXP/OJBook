package design;

import java.util.Random;

/**
 * @program: SolutionDesign1
 * @description: Solution design 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/7
 **/
public class SolutionDesign1 {
    int[] history;
    int[] data;

    public SolutionDesign1(int[] nums) {
        data = nums;
        history = data.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return history;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n = history.length;
        for (int i = 0; i < n; i++) {
            int position1 = new Random().nextInt(n);
            int position2 = new Random().nextInt(n);
            int temp = data[position1];
            data[position1] = data[position2];
            data[position2] = temp;
        }
        return data;
    }
}
