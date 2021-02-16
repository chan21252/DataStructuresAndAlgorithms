package com.chan.list;

/**
 * 单向链表
 *
 */
public class LinkList<T> {
    //头节点
    private Node<T> head;

    public LinkList() {
        head = new Node<>();
        head.next = null;
    }

    public LinkList(Node<T>[] data, int n) {

    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public int length() {
        Node<T> p = head.next;
        int count = 0;

        while (p != null) {
            p = p.next;
            count++;
        }

        return count;
    }

    public void traverse() {
        Node<T> p = head.next;

        while (p != null) {
            System.out.print(p.data.toString() + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void insert(T element, int pos){

    }

}

class Node<T> {
    T data;
    Node<T> next;
}