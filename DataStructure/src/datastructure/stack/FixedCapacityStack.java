package datastructure.stack;

/**
 * 固定容量的栈,支持泛型
 *
 * @author Administrator
 * @since 2020-03-07
 */
public class FixedCapacityStack<T> {
    /**
     * 保存栈内容
     */
    private T[] arr;

    /**
     * 栈当前元素个数
     */
    private int n;

    public FixedCapacityStack(int cap) {
        arr = (T[]) new Object[cap];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return n == arr.length;
    }

    public void push(T item) {
        arr[n++] = item;
    }

    public T pop() {
        return arr[--n];
    }

    public int size() {
        return n;
    }
}
