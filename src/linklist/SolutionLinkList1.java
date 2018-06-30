package linklist;

/**
 * @program: OJBook
 * @description:
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-26 10:07
 **/
public class SolutionLinkList1 {

    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        ListNode listNode = node;
        while (listNode.next.next != null) {
            listNode.val = temp;
            listNode = listNode.next;
            temp = listNode.next.val;
        }
        listNode.val = listNode.next.val;
        listNode.next = null;
    }
}
