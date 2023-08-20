package com.company;

import java.util.*;

public class LinkedList<T>{
    Node<T> head;
    protected int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public void addToFront(T item){
        Node<T> t = new Node<>(item);

        if (this.head == null) {
            head = t;
        }
        size++;
    }

    public void addToBack(T item) {
        Node<T> t = new Node<>(item);

        if (this.head == null) {
            head = t;
        }

        else {
            Node<T> X = head;
            while (X.next != null) {
                X = X.next;
            }
            X.next = t;
        }
        size++;
    }

    public void remove(int index){
    }

    /*public T get(int index){
        return
    }
*/
    public void clear(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        if (head == null)
            return result;
        for (Node<T> p = head; p != null; p = p.getNext()) {
            result += p.getItem() + "\n";
        }
        return result.substring(0,result.length()-1);
    }
}