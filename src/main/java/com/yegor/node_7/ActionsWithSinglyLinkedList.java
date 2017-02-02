package com.yegor.node_7;


/**
 * This class adds elements to a list and returns them in reverse order.
 * Created by YegorKost on 02.02.2017.
 */
public class ActionsWithSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add("a");
        singlyLinkedList.add("b");
        singlyLinkedList.add("c");
        singlyLinkedList.add("aa");
        singlyLinkedList.add("ff");
        for (String s : singlyLinkedList) {
            System.out.println(s);
        }
    }
}
