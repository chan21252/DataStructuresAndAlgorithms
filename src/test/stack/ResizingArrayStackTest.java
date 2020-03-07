package test.stack;

import datastructures.stack.ResizingArrayStack;
import util.StdIn;
import util.StdOut;

public class ResizingArrayStackTest {
    public static void main(String[] args) {
        ResizingArrayStack<String> s = new ResizingArrayStack<String>(1);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals("-")) {
                s.push(item);
            } else {
                s.pop();
            }
        }

        for (String item : s) {
            StdOut.println(item);
        }
    }
}
