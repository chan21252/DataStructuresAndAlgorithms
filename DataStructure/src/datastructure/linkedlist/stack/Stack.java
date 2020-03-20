package datastructure.linkedlist.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 下压栈的链表实现
 *
 * @author Chan
 * @since 2020/3/8
 */
public class Stack<Item> implements Iterable<Item> {
    //栈顶节点
    private Node first = null;
    //栈节点的数量
    private int N = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    /**
     * 栈顶添加元素
     *
     * @param item 泛型Item类型参数
     */
    public void push(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        Node oldFirst = first;
        first = newNode;
        newNode.next = oldFirst;
        N++;
    }

    /**
     * 取出栈顶元素
     *
     * @return Item
     */
    public Item pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("栈为空");
        }
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    /**
     * 返回栈顶元素，不弹出栈
     *
     * @return Item
     */
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }
        return first.item;
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

    /**
     * 节点
     */
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