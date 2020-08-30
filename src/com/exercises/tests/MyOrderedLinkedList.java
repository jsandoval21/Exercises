package com.exercises.tests;

public class MyOrderedLinkedList {
    Node head;

    public void add(int data) {
        Node cur = head;
        Node newNode = new Node(data);
        if(this.head == null)
            this.head = new Node(data);
        else if (data < this.head.data){
            newNode.next = this.head;
            this.head = newNode;
        } else {
            Node ahead = cur.next;
            while(ahead != null && data > ahead.data) {
                ahead = ahead.next;
                cur = cur.next;
            }
            if (ahead == null) {
                cur.next = newNode;
            } else {
                newNode.next = ahead;
                cur.next = newNode;
            }
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
