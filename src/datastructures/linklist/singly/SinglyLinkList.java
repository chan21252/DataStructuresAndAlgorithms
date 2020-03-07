package datastructures.linklist.singly;

/**
 * 单向链表
 *
 * @author Chan
 * @since 2020/3/7
 */
public class SinglyLinkList<T> {

    //头节点
    private Node<T> first = null;
    //节点的数量
    private int n = 0;

    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 在链表头部插入节点
     *
     * @param node Node
     */
    public void addFirst(Node<T> node) {
        Node<T> temp = first;
        first = node;
        node.next = temp;

        /*
        if (first != null) {
            node.next = first.next;
        }
        first = node;
        */
        n++;
    }

    /**
     * 在链表尾部插入节点
     *
     * @param node Node
     */
    public void addLast(Node<T> node) {
        if (first == null) {
            first = node;
        } else {
            Node<T> last = getLast();
            last.next = node;
            node.next = null;
        }

        n++;
    }

    /**
     * 在索引index的节点前面插入节点
     *
     * @param node  Node
     * @param index 索引
     */
    public void add(Node<T> node, int index) {
        if (index > n - 1 || n < 0) {
            throw new IndexOutOfBoundsException("下标越界");
        }

        if (index == 0) {
            addFirst(node);
        } else {
            Node<T> pre = get(index - 1);
            node.next = pre.next;
            pre.next = node;
        }
        n++;
    }

    /**
     * 删除index号元素
     *
     * @param index 索引
     */
    public void delete(int index) {
        if (index > n - 1 || index < 0) {
            throw new IndexOutOfBoundsException("下标越界");
        }

        if (index == 0) {
            deleteFirst();
        } else {
            Node<T> pre = get(index - 1);
            pre.next = pre.next.next;
        }
        n--;
    }

    /**
     * 删除第一个节点
     */
    public void deleteFirst() {
        if (first == null) {
            throw new UnsupportedOperationException("链表为空");
        }
        first = first.next;
        n--;
    }

    /**
     * 删除最后一个节点
     */
    public void deleteLast() {
        if (first == null) {
            throw new UnsupportedOperationException("链表为空");
        }
        Node<T> temp = get(n - 2);
        temp.next = null;
        n--;
    }

    public int size() {
        return n;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return get(n - 1);
    }

    /**
     * 获取index号节点
     *
     * @param index 索引
     * @return Node
     */
    public Node<T> get(int index) {
        if (index > n - 1 || index < 0) {
            throw new IndexOutOfBoundsException("下标越界");
        }

        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void traversal() {
        for (Node<T> temp = first; temp != null; temp = temp.next) {
            System.out.printf("%s", temp.item.toString());
        }
        System.out.println();
    }
}
