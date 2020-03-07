package test.linkList;

import datastructures.linklist.singly.Node;
import datastructures.linklist.singly.SinglyLinkList;

/**
 * 单向链表测试
 *
 * @author Chan
 * @since 2020/3/7
 */
public class SinglyLinkListTest {
    public static void main(String[] args) {
        SinglyLinkList<String> linkList = new SinglyLinkList<String>();
        Node<String> node1 = new Node<String>();
        Node<String> node2 = new Node<String>();
        Node<String> node3 = new Node<String>();
        Node<String> node4 = new Node<String>();
        node1.item = "J";
        node2.item = "A";
        node3.item = "V";
        node4.item = "A";

        linkList.addFirst(node1);
        linkList.addLast(node4);
        linkList.add(node3, 1);
        linkList.add(node2, 1);

        linkList.traversal();   // JAVA


        linkList.addLast(new Node<String>("O"));
        linkList.add(new Node<String>("L"), 4);
        linkList.add(new Node<String>("L"), 4);
        linkList.add(new Node<String>("H"), 4);
        linkList.add(new Node<String>("E"), 5);

        linkList.traversal();   //JAVAHELLO

        linkList.deleteLast();
        linkList.traversal();   //JAVAHELL

        linkList.deleteFirst();
        linkList.traversal();   //AVAHELL

        linkList.delete(4);
        linkList.traversal();   //AVAHLL

    }
}
