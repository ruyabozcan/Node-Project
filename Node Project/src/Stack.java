package com.company;

public interface Stack<E> {
    E pop();
    void push(E item);
    boolean hashItems();
    int size();
}
