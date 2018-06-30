package linklist;

import java.util.List;
import java.util.Stack;

/**
 * @program: SolutionLinkList5
 * @description: Solution linklist 5 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/30
 **/
public class SolutionLinkList5 {
    public ListNode head;

    public boolean isPalindrome2(ListNode head) {
        int n = 1;
        int count = 0;
        ListNode node = head;
        if (head == null) {
            return true;
        }
        while (node.next != null) {
            node = node.next;
            n++;
        }
        node = head;
        ListNode temp = null;
        ListNode temp2 = null;
        ListNode frontNode = head;
        while (count < n / 2) {
            if (count == (n / 2 - 1)) {
                temp = node;
                temp2 = n % 2 == 1 ? temp.next.next : temp.next;
            }
            ListNode tempForFront = node;
            ListNode newTemp = node.next;
            node.next = frontNode;
            node = newTemp;
            frontNode = tempForFront;
            count++;
        }
        head.next = null;
        return judgeSame(temp, temp2);

    }

    public boolean judgeSame(ListNode node, ListNode node2) {
        ListNode t1 = node;
        ListNode t2 = node2;
        while (t1 != null && t2 != null) {
            if (t1.val != t2.val) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        this.head = head;
        return sss(head);
    }

    public boolean sss(ListNode node) {
        int n = 0;
        if (node.next != null) {
            if (!sss(node.next)) {
                return false;
            } else {
                if (node.val != head.val) {
                    return false;
                } else {
                    head = head.next;
                    return true;
                }
            }
        } else {
            if (node.val != head.val) {
                return false;
            } else {
                head = head.next;
                return true;
            }
        }
    }
}
