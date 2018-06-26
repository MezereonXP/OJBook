package linklist;

/**
 * @program: OJBook
 * @description: Solution for linklist 2 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-26 14:06
 **/

public class SolutionLinkList2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int count = 1;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        int position = count - n;
        node = head;
        for (int i = 1; i < position; i++) {
            node = node.next;
        }
        if (position == 0) {
            head = node.next;
        } else if (position == count) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }

        return head;
    }
}
