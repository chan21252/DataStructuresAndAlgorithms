package datastructure.linkedlist.single.version2;

/**
 * SinglyLinkedList
 *
 * @author Chan
 * @since 2020/3/20
 */
public class SingleLinkedList<Item> {
    private Node<Item> head;
    private int length;

    public SingleLinkedList() {
        //头节点不存放数据
        head = new Node<Item>();
        head.item = null;
        head.next = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public int size() {
        return length;
    }

    /**
     * 在链表末尾添加节点
     *
     * @param item Item泛型
     */
    public void add(Item item) {
        Node<Item> newNode = new Node<Item>(item, null);
        Node<Item> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        length++;
    }

    /**
     * 在指定位置添加节点
     *
     * @param item  Item泛型数据
     * @param index 位置编号
     */
    public void add(Item item, int index) {
        Node<Item> newNode = new Node<>(item, null);
        if (isEmpty() && index == 0) {
            head.next = newNode;
            length++;
            return;
        }

        if (index < 0 || index > length - 1) {
            throw new UnsupportedOperationException("index越界");
        }

        Node<Item> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        length++;
    }


    /**
     * 获取编号index节点
     *
     * @param index 编号
     * @return Item泛型
     */
    private Node<Item> get(int index) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }

        if (index < 0 || index > length - 1) {
            throw new UnsupportedOperationException("index越界");
        }

        Node<Item> temp = head;
        for (int i = 0; i < index + 1; i++) {
            temp = temp.next;
        }

        return temp;
    }

    /**
     * 获取编号index节点的数据域
     *
     * @param index 编号
     * @return Item泛型
     */
    public Item getItem(int index) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }

        if (index < 0 || index > length - 1) {
            throw new UnsupportedOperationException("index越界");
        }

        Node<Item> temp = head;
        for (int i = 0; i < index + 1; i++) {
            temp = temp.next;
        }

        return temp.item;
    }

    /**
     * 删除指定编号的节点
     *
     * @param index 编号
     */
    public void delete(int index) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }

        if (index < 0 || index > length - 1) {
            throw new UnsupportedOperationException("index越界");
        }

        Node<Item> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        length--;
    }

    /**
     * 遍历打印链表
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("链表为空");
            return;
        }

        Node<Item> temp = head;

        while (temp.next != null) {
            temp = temp.next;
            System.out.printf("%s\n", temp.item);
        }
        System.out.println();
    }

    /**
     * 逆序
     */
    public void reserve() {
        //为空，或只有一个节点无需操作
        if (head.next == null || head.next.next == null) {
            return;
        }
        Node<Item> reserve = new Node<>(null, null);

        Node<Item> current = head.next;
        while (current != null) {
            Node<Item> next = current.next;
            current.next = reserve.next;
            reserve.next = current;
            current = next;
        }

        head.next = reserve.next;
    }
}

class Node<Item> {
    Item item;
    Node<Item> next;

    protected Node() {

    }

    protected Node(Item item, Node<Item> next) {
        this.item = item;
        this.next = next;
    }
}
