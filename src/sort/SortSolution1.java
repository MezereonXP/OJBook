package sort;

import java.util.Arrays;

/**
 * @program: SortSolution1
 * @description: Solution sort 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/5
 **/
public class SortSolution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int position1 = 0;
        int position2 = 0;
        while (position1 != m && n != 0) {
            if (nums1[position1] > nums2[position2]) {
                int temp = nums1[position1];
                nums1[position1] = nums2[position2];
                nums2[position2] = temp;
                sort(nums2);
            }
            position1++;
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }

    private void sort(int[] nums2) {
        int temp = 0;
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[temp] > nums2[i]) {
                int t = nums2[temp];
                nums2[temp] = nums2[i];
                nums2[i] = t;
                temp = i;
            } else {
                break;
            }
        }
    }
}
