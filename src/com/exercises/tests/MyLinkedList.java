package com.exercises.tests;

public class MyLinkedList {
    Node head;

    public void add(int data) {
        if(this.head == null)
            this.head = new Node(data);
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean search(int data) {
        Node cur = head;
        while(cur != null){
             if(cur.data == data)
                 return true;
             cur = cur.next;
         }

         return false;
    }

    public void traverse () {
        Node cur = head;
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
