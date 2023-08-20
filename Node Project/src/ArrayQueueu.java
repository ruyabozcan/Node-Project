// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

public class ArrayQueueu<Y> implements Queue<Y> {
    private Y[] array2;
    private int top = -1;
    private int bottom = 0;
    private static final int DEFAULT_CAPACITY = 6;

    public ArrayQueueu(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayQueueu(int capacity) {
        array2 = (Y[ ]) new Object[capacity];
    }

    @Override
    public boolean hashItems() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public Y dequeue() {
        if(hashItems()) {
            return null;
        }
        Y result = array2[bottom];
        array2[bottom++] = null;
        return result;
    }

    @Override
    public void enqueue(Y item) {
        if (size() == array2.length) throw new IllegalStateException("Stack is full");
        array2[++top] = item;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
