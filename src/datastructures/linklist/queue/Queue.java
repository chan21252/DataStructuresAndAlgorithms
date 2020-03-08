package datastructures.linklist.queue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 队列的链表实现
 *
 * @author Chan
 * @since 2020/3/8
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int N;

    public Queue() {
        first = null;
        last = null;
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    /**
     * 向队列尾部添加元素
     *
     * @param item Item泛型对象
     */
    private void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        N++;
    }

    /**
     * 从队列头部取出元素
     *
     * @return Item泛型对象
     */
    private Item dequeue() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("队列为空");
        }

        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = first;
        }
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    @Override
    public void forEach(Consumer<? super Item> action) {
        throw new UnsupportedOperationException("不支持");
    }

    @Override
    public Spliterator<Item> spliterator() {
        throw new UnsupportedOperationException("不支持");
    }

    private class Node {
        Item item;
        Node next;
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }
}
