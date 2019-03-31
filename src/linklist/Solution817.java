package linklist;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution817
 * @Description 链表组件
 * @Author User
 * @Date 2019/3/31 14:59
 * @Version 1.0
 **/
public class Solution817 {
    public static void main(String[] args) {
        Solution817 solution817 = new Solution817();
        ListNode head = new ListNode("0,3,2,4,1");
        int[] G = {3, 0, 2};
        System.out.println(solution817.numComponents(head, G));
    }

    public int numComponents(ListNode head, int[] G) {
        ListNode p = head;
        int count = 0;
        int flag = 0;
        Arrays.sort(G);
        while (p != null) {
            if (Arrays.binarySearch(G, p.val) > -1 && flag == 0) {
                count++;
                flag = 1;
            }
            if (Arrays.binarySearch(G, p.val) <= -1) {
                flag = 0;
            }
            p = p.next;
        }
        return count;
    }
}
