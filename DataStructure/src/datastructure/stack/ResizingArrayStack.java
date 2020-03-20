package datastructure.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 弹性容量的栈,支持泛型，支持动态扩容
 *
 * @author Administrator
 * @since 2020-03-07
 */
public class ResizingArrayStack<T> implements Iterable<T> {
    /**
     * 保存栈内容
     */
    private T[] arr;

    /**
     * 栈当前元素个数
     */
    private int N;

    public ResizingArrayStack(int cap) {
        arr = (T[]) new Object[cap];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == arr.length;
    }

    public void push(T item) {
        //满了就扩容到2倍
        if (N == arr.length) {
            resize(2 * arr.length);
        }
        arr[N++] = item;
    }

    public T pop() {
        //指针前移，获得栈顶元素
        T item = arr[--N];

        //出栈，栈顶元素置空
        arr[N] = null;

        //缩减容量，满足当前元素个数为容量的1/2
        if (N > 0 && N == (arr.length / 4)) {
            resize(arr.length / 2);
        }

        return item;
    }

    /**
     * 查看栈顶元素
     *
     * @return item
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }

        return arr[N - 1];
    }

    public int size() {
        return N;
    }

    /**
     * 扩容
     *
     * @param capacity 容量
     */
    public void resize(int capacity) {
        T[] temp = (T[]) new Object[capacity];

        for (int i = 0; i < N; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }

    /**
     * 逆序迭代器
     */
    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return arr[--i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            throw new UnsupportedOperationException();
        }
    }
}
