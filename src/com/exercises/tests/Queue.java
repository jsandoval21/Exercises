package com.exercises.tests;

public class Queue {
    DELinkedList myQueue = new DELinkedList();
    int count = 0;

    public boolean isEmpty(){
        if(myQueue.head == null)
            return true;

        return false;
    }

    public int size(){
        return count;
    }

    public void push(int val){
        myQueue.insert(val);
        count++;
    }

    public void pop(){
        myQueue.deleteLast();
        count--;
    }

    public void  front(){
        if (myQueue.head != null)
            System.out.println(myQueue.tail.value);
    }

    public void last(){
        if (myQueue != null)
            System.out.println(myQueue.head.value);
    }

}
