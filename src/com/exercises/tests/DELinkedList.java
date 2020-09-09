package com.exercises.tests;

public class DELinkedList {
    DLNode head;
    DLNode tail;

    //insert value in front
    public void insert(int val) {
        if (head == null) {
            head = new DLNode(val);
            tail = head;
        } else {
            DLNode temp = new DLNode(val);
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }

    //Delete from the front
    public void delete(){
        if(head != null) {
            if(head.next != null){
                head = head.next;
                head.prev = null;
            } else {
                head = null;
                tail = null;
            }
        }
    }

    public void insertLast(int val) {
        if(tail == null) {
            head = new DLNode(val);
            tail = head;
        } else {
            DLNode temp = new DLNode(val);
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void deleteLast(){
        if(tail != null) {
            if(tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                tail = null;
                head = null;
            }
        }
    }

    public void displayForward() {
        DLNode cur = head;
        while (cur != null) {
            if (cur.next != null)
                System.out.print(cur.value + "->");
            else
                System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public void displayBackward() {
        DLNode cur = tail;
        while (cur != null) {
            if (cur.prev != null)
                System.out.print(cur.value + "->");
            else
                System.out.println(cur.value);
            cur = cur.prev;
        }
    }
}
