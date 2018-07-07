package design;

import java.util.Stack;

/**
 * @program: MinStack
 * @description: Class in leetcode degisn 2
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/7
 **/
class MinStack {

    private Stack stack;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        if (stack.empty()) {
            min = x;
        } else {
            min = min > x ? x : min;
        }
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        min = Integer.MAX_VALUE;
        for (Object i : stack) {
            int temp = (int) i;
            if (temp < min) {
                min = temp;
            }
        }
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return min;
    }
}
