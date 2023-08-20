package com.company;

public interface Queue<Y> {
    Y dequeue();
    void enqueue(Y item);
    boolean hashItems();
    int size();
}
