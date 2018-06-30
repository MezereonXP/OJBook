package linklist;

import dp.SolutionDP4;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/30.
 */
public class SolutionLinkList3Test {

    @Test
    public void reverseList() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        SolutionLinkList3 solutionLinkList3 = new SolutionLinkList3();
        solutionLinkList3.reverseList(head);
    }

}