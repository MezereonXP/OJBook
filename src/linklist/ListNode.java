package linklist;

/**
 * @program: OJBook
 * @description: Node in linklist
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-06-26 14:07
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(String s) {
        String[] strings = s.split(",");
        if (strings[0].equals(""))
            return;
        this.val = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            this.next = new ListNode(s.substring(2));
        }
    }
}
