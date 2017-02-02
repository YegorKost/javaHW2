package com.yegor.node_7;

import java.util.Iterator;

/**
 * This class represents singly linked list.
 * Created by YegorKost on 02.02.2017.
 */

public class SinglyLinkedList<E> implements Iterable<E>{

    private Node<E> first; // remember first element
    private static int size;

    private static class Node<E> {
        Node<E> next; // reference to next element
        E elem; // element
        int index; // index of element
    }

    /**
     * Method finds last element.
     * @param fromFirst first element
     * @return last element
     */
    private Node<E> findLastNode(Node<E> fromFirst) {
        if (fromFirst.next != null) {
            return findLastNode(fromFirst.next);
        } else{
            return fromFirst;
        }
    }

    /**
     * Method return element by index.
     * @param index index of element
     * @param fromFirst first element
     * @return element by index
     */
    private Node<E> get(int index, Node<E> fromFirst) {
        if (index < size && index >=0 && index != fromFirst.index) {
            return get(index, fromFirst.next);
        } else {
            return fromFirst;
        }
    }

    /**
     * Method adds element to list.
     * @param elem element that will be added to list
     */
    public void add(E elem) {
        Node<E> newNode = new Node<>();
        newNode.elem = elem;
        newNode.index = size++;
        if (this.first == null) {
            this.first = newNode;
        } else {
            findLastNode(this.first).next = newNode;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int sizeForIterator = size;
            Node<E> nodeForIterator = first;
            @Override
            public boolean hasNext() {
                return sizeForIterator > 0;
            }

            @Override
            public E next() {
                return get(--sizeForIterator, nodeForIterator).elem;
            }
        };
    }
}


