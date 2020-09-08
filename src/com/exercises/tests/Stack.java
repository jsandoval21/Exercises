package com.exercises.tests;

public class Stack extends MyLinkedList{
    public int count = 0;

    public void push(int value) {
        if (isEmpty())
            this.head = new Node(value);
        else {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        }
        count++;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        else {
            return head.data;
        }
    }

    public int pop(){
        if(isEmpty())
            return -1;
        else {
            Node temp = head;
            head = head.next;
            count--;
            return temp.data;
        }
    }

    public int searchStack(int value){
        Node cur = head;
        if(isEmpty())
            return -1;
        else{
            while(cur != null) {
                if(cur.data == value){
                    return cur.data;
                }

                cur = cur.next;
            }
        }

        return -1;
    }

    public boolean isEmpty() {
        if(head == null)
            return true;

        return false;
    }

    public int size(){
        return count;
    }
}
