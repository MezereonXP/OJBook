package linklist;

/**
 * @program: SolutionLinkList6
 * @description: Solution linklist 6  for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/30
 **/
public class SolutionLinkList6 {
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.val == Integer.MAX_VALUE) {
                return true;
            } else {
                node.val = Integer.MAX_VALUE;
                node = node.next;
            }
        }
        return false;
    }
}
