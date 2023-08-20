package com.company;

public class ArrayStack<E> implements Stack<E> {
    private E[] array1;
    private int top = -1;
    private static final int DEFAULT_CAPACITY = 6;

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayStack(int capacity) {
        array1 = (E[ ]) new Object[capacity];
    }

    @Override
    public boolean hashItems() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public E pop() {
        if(hashItems()){
            return null;
        }
        E result = array1[top];
        array1[top--] = null;
        return result;
    }

    @Override
    public void push(E item) {
        if (size() == array1.length) throw new IllegalStateException("Stack is full");
        array1[++top] = item;
    }

    @Override
    public int size() {
        return top + 1;
    }
}