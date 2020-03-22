package datastructure.linkedlist.single.version1;

/**
 * 节点
 *
 * @author Chan
 * @since 2020/3/7
 */

public class Node<T> {
    //数据域
    public T item;
    //指向下个节点的引用
    public Node<T> next;

    public Node() {
    }

    public Node(T item) {
        this.item = item;
    }
}