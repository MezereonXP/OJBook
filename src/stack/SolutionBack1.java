package stack;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: SolutionBack1
 * @description: Solution back 1 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/22
 **/
public class SolutionBack1 {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> linkedList = new LinkedList<>();
        char[] data = digits.toCharArray();
        for (int i = 0; i < data.length; i++) {
            int shift = data[i] - '1';
            if (i == 0) {
                if (data[i] > '1' && data[i] < '7') {
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 3)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 2)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 1)));
                }
                if (data[i] == '7') {
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 3)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 2)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 1)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift)));
                }
                if (data[i] == '8') {
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 2)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 1)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift)));
                }
                if (data[i] == '9') {
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 2)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift - 1)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift)));
                    linkedList.addLast(Character.toString((char) ('a' + 3 * shift + 1)));
                }
                continue;
            }
            if (data[i] > '1' && data[i] < '7') {
                while (linkedList.get(0).length() == i) {
                    String temp = (String) linkedList.get(0);
                    linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 3)));
                    linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 2)));
                    linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 1)));
                    linkedList.removeFirst();
                }
            } else {
                while (linkedList.get(0).length() == i) {
                    String temp = (String) linkedList.get(0);
                    if (data[i] == '7') {
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 3)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 2)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 1)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift)));
                    }
                    if (data[i] == '8') {
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 2)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 1)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift)));
                    }
                    if (data[i] == '9') {
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 2)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift - 1)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift)));
                        linkedList.addLast(temp + Character.toString((char) ('a' + 3 * shift + 1)));
                    }
                    linkedList.removeFirst();
                }
            }
        }
        return linkedList;
    }
}
