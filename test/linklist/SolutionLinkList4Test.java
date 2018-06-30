package linklist;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/30.
 */
public class SolutionLinkList4Test {
    @Test
    public void mergeTwoLists() throws Exception {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        SolutionLinkList4 solutionLinkList4 = new SolutionLinkList4();
        solutionLinkList4.mergeTwoLists(node1, node2);
    }

}