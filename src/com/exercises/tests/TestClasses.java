package com.exercises.tests;

public class TestClasses {

    private static MyLinkedList myList;

    public static void main(String[] args) {
/*      myList = new MyLinkedList();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(40);
        myList.traverse();
        System.out.println(myList.search(10));*/
        MyOrderedLinkedList myOrderList = new MyOrderedLinkedList();

        myOrderList.add(20);
        myOrderList.add(5);
        myOrderList.add(6);
        myOrderList.add(4);
        myOrderList.add(8);
        myOrderList.add(10);
        myOrderList.traverse();
        System.out.println(myOrderList.search(7));
    }
}
