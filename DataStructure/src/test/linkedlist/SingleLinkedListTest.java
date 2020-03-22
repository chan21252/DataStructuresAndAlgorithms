package test.linkedlist;

import datastructure.linkedlist.single.version2.SingleLinkedList;

/**
 * @author Chan
 * @since 2020/3/22
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        Hero hero1 = new Hero(1, "宋江", "及时雨");
        Hero hero2 = new Hero(2, "卢俊义", "玉麒麟");
        Hero hero3 = new Hero(3, "吴用", "智多星");
        Hero hero4 = new Hero(4, "公孙胜", "入云龙");
        SingleLinkedList<Hero> linkedList = new SingleLinkedList<Hero>();

        linkedList.add(hero1);
        linkedList.add(hero2);
        linkedList.add(hero3);
        linkedList.add(hero4);
        linkedList.list();

        linkedList.reserve();
        linkedList.list();
    }
}

class Hero {
    private int no;
    private String name;
    private String nickName;

    public Hero(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
