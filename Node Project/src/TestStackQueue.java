package com.company;

public class TestStackQueue {

    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>(6);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while (!s.hashItems()) {
            System.out.println(s.pop());
        }

        ArrayQueueu<Integer> s2 = new ArrayQueueu<>(6);
        s2.enqueue(1);
        s2.enqueue(2);
        s2.enqueue(3);
        s2.enqueue(4);
        s2.enqueue(5);
        s2.enqueue(6);
        while (!s2.hashItems()) {
            System.out.println(s2.dequeue());
        }
    }
}