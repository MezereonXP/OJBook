package array;/**
 * Created by Administrator on 2018/6/7.
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: SolutionArray6
 * @description: Solution for array 6 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray6 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList list = new ArrayList();
        for (int n:nums2){
            for (int i=0;i<nums1.length;i++){
                if (nums1[i] == n){
                    list.add(n);
                    nums1[i] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i=0;i<result.length;i++){
            result[i] = (int) list.get(i);
        }
        return result;
    }
}
