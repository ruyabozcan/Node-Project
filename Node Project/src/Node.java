package com.company;

public class Node<T> {
    T item;
    Node<T> next;

    public Node(T item){
        item = item;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getItem() {
        return item;
    }
}
