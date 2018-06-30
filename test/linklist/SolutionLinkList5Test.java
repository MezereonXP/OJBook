package linklist;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/30.
 */
public class SolutionLinkList5Test {
    @Test
    public void isPalindrome() throws Exception {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        SolutionLinkList5 solutionLinkList5 = new SolutionLinkList5();
        Assert.assertEquals(solutionLinkList5.isPalindrome(listNode), true);
        Assert.assertEquals(solutionLinkList5.isPalindrome2(listNode), true);


    }

}