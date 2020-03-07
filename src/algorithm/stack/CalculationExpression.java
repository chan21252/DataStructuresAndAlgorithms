package algorithm.stack;

import datastructures.stack.ResizingArrayStack;

/**
 * 计算表达式的值，允许 + - * /（）, 但是要用空格隔开
 *
 * @author Chan
 * @since 2020/3/7
 */
public class CalculationExpression {
    public static double calculation(String express) {
        ResizingArrayStack<Double> numbers = new ResizingArrayStack<Double>(10);
        ResizingArrayStack<String> operations = new ResizingArrayStack<String>(10);

        /*
        遍历表达式，
        数字和操作符分别入栈，
        忽略(，
        遇到)，取出一个操作符和两个数字进行运算，结果重新入栈
         */
        String[] expressArr = express.split(" ");
        for (String s : expressArr) {
            if (s.equals("(")) {
                // do nothing
            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operations.push(s);
            } else if (s.equals(")")) {
                double rightNum = numbers.pop();
                double leftNum = numbers.pop();
                String operation = operations.pop();
                double value;
                switch (operation) {
                    case "+":
                        value = leftNum + rightNum;
                        break;
                    case "-":
                        value = leftNum - rightNum;
                        break;
                    case "*":
                        value = leftNum * rightNum;
                        break;
                    case "/":
                        value = leftNum / rightNum;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + operation);
                }

                numbers.push(value);
            } else {
                numbers.push(Double.parseDouble(s));
            }
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        System.out.println(calculation(expression));
    }
}
