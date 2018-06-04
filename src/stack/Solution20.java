package stack;/**
 * Created by Administrator on 2018/6/4.
 */

import java.util.Stack;

/**
 * @program: solution20
 * @description: Solution20 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/4
 **/
public class Solution20 {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.empty())
                stack.push(chars[i]);
            else {
                switch (chars[i]){
                    case ']':
                        if ((char)stack.peek() == '['){
                            stack.pop();
                        } else {
                            stack.push(chars[i]);
                        }
                        break;
                    case ')':
                        if ((char)stack.peek() == '('){
                            stack.pop();
                        } else {
                            stack.push(chars[i]);
                        }
                        break;
                    case '}':
                        if ((char)stack.peek() == '{'){
                            stack.pop();
                        } else {
                            stack.push(chars[i]);
                        }
                        break;
                    default:
                        stack.push(chars[i]);
                }
            }
        }
        return stack.empty();
    }
}
