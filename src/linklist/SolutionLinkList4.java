package linklist;

/**
 * @program: SolutionLinkList4
 * @description: Solution linklist 3 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/30
 **/
public class SolutionLinkList4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
            if (l1 == null && l2 == null) {
                return l1;
            } else if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            }
        ListNode node = temp1.val >= temp2.val ? temp2 : temp1;
        if (temp1.val >= temp2.val) {
            temp2 = temp2.next;
        } else {
            temp1 = temp1.next;
        }
        while(temp1!=null&&temp2!=null) {
            if (temp1.val >= temp2.val) {
                node.next = temp2;
                temp2 = temp2.next;
            } else {
                node.next = temp1;
                temp1 = temp1.next;
            }
            node = node.next;
        }
        while (temp1 != null) {
            node.next = temp1;
            node = node.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            node.next = temp2;
            node = node.next;
            temp2 = temp2.next;
        }
        return l1.val >= l2.val ? l2 : l1;
    }
}
