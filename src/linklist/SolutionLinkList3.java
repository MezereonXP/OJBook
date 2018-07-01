package linklist;

/**
 * @program: SolutionLinkList3
 * @description: Solution for linklist 3 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/26
 **/
public class SolutionLinkList3 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode frontNode = head;
        ListNode temp = head.next;
        head.next = null;
        while (temp != null) {
            ListNode tempForFront = temp;
            ListNode newTemp = temp.next;
            temp.next = frontNode;
            temp = newTemp;
            frontNode = tempForFront;
        }
        return frontNode;
    }

}
