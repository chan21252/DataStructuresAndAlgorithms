package test.stack;

import datastructures.stack.FixedCapacityStackOfString;
import util.StdIn;
import util.StdOut;

public class FixedCapacityStackOfStringTest {
    public static void main(String[] args) {
        FixedCapacityStackOfString s = new FixedCapacityStackOfString(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals("-")) {
                if (!s.isFull()) {
                    s.push(item);
                }
            } else {
                if (!s.isEmpty()) {
                    StdOut.print(s.pop() + " ");
                }
            }
        }
    }
}
