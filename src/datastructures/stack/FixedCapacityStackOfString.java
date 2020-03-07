package datastructures.stack;

/**
 * 固定容量的字符串栈
 *
 * @author Administrator
 * @since 2020-03-07
 */
public class FixedCapacityStackOfString {
    /**
     * 保存栈内容
     */
    private String[] arr;

    /**
     * 栈当前元素个数
     */
    private int n;

    public FixedCapacityStackOfString(int cap) {
        arr = new String[cap];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return n == arr.length;
    }

    public void push(String s) {
        arr[n++] = s;
    }

    public String pop() {
        return arr[--n];
    }

    public int size() {
        return n;
    }
}
