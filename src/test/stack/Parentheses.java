package test.stack;

import datastructures.linklist.stack.Stack;
import util.In;
import util.StdOut;

/**
 * 从输入流读取字符串，判断括号是否匹配
 *
 * @author Chan
 * @since 2020/3/8
 */
public class Parentheses {
    private static final char LEFT_PAREN = '(';
    private static final char RIGHT_PAREN = ')';
    private static final char LEFT_BRACE = '{';
    private static final char RIGHT_BRACE = '}';
    private static final char LEFT_BRACKET = '[';
    private static final char RIGHT_BRACKET = ']';

    public static boolean isBalanced(String s) {
        /*
         * 遇到左括号入栈，
         * 遇到右括号，出栈栈顶元素，如果出栈元素和右括号不匹配，或者栈为空，报错缺少左括号
         * 如果结束后，栈类还有元素，则不匹配，缺少右括号
         */

        Stack<Character> stack = new Stack<Character>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == LEFT_PAREN || c == LEFT_BRACKET || c == LEFT_BRACE) {
                stack.push(c);
            }

            if (c == RIGHT_PAREN) {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != LEFT_PAREN) {
                    return false;
                }
            }

            if (c == RIGHT_BRACKET) {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != LEFT_BRACKET) {
                    return false;
                }
            }

            if (c == RIGHT_BRACE) {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != LEFT_BRACE) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        In in = new In();
        String s = in.readAll().trim();
        StdOut.println(isBalanced(s));
    }
}
