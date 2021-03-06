package com.exercises.tests;

public class TestClasses {

    private static MyLinkedList myList;

    public static void main(String[] args) {
        //Test a queue
        Queue myQueue = new Queue();
        myQueue.push(5);
        myQueue.push(4);
        myQueue.push(10);
        myQueue.push(1);
        myQueue.push(11);
        myQueue.push(15);

        while(!myQueue.isEmpty()){
            System.out.println("Queue size: " + myQueue.size());
            System.out.print("Next in queue: ");
            myQueue.front();
            myQueue.pop();
        }
        System.out.println("Queue size: " + myQueue.size());

        //Test double ended doubly-linked list
        /*DELinkedList myList = new DELinkedList();
        myList.insert(5);
        myList.insert(4);
        myList.insert(10);
        myList.insertLast(22);
        myList.insertLast(23);
        myList.insertLast(15);
        myList.delete();
        myList.deleteLast();


        myList.displayForward();
        myList.displayBackward();*/


        //Test Stacks and Queues
/*        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(10);
        myStack.push(8);
        myStack.push(9);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.searchStack(5));*/



/*        //Test linked list
        myList = new MyLinkedList();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(40);
        myList.traverse();
        System.out.println(myList.search(10));*/

        // Test Ordered Linked List
/*        MyOrderedLinkedList myOrderedList = new MyOrderedLinkedList();
        myOrderedList.add(20);
        myOrderedList.add(5);
        myOrderedList.add(6);
        myOrderedList.add(4);
        myOrderedList.add(8);
        myOrderedList.add(10);
        myOrderedList.traverse();
        System.out.println(myOrderedList.search(10));
        myOrderedList.delete(4);
        myOrderedList.traverse();
        System.out.println(myOrderedList.search(4));*/


        //Test binary trees
        /*MyBinaryTree tree = new MyBinaryTree();
        TreeNode root = new TreeNode(15);
        tree.insert(root, 9);
        tree.insert(root, 8);
        tree.insert(root, 20);
        tree.insert(root, 11);
        tree.insert(root, 24);
        tree.insert(root, 17);
        tree.insert(root, 19);
        tree.insert(root, 22);
        tree.insert(root, 23);
        tree.insert(root, 21);
        tree.insert(root, 12);
        tree.insert(root, 25);
        tree.insert(root, 10);
        tree.insert(root, 5);
        System.out.println("Before delete: ");
        tree.traverseInOrder(root);
        System.out.println();
        tree.deleteNode(root, null,15);
        tree.deleteNode(root, null,11);
        tree.deleteNode(root, null,17);
        tree.deleteNode(root, null,23);
        tree.deleteNode(root, null,25);
        tree.deleteNode(root, null,8);

        System.out.println("After delete: ");
        tree.traverseInOrder(root);*/

//        tree.traversePostOrder(root);
//        System.out.println();
//        tree.traversePreOrder(root);
//        System.out.println(tree.searchValue(root, 9));
//        System.out.println(tree.searchValue(root, 10));
//        System.out.println(tree.searchValue(root, 15));
//        System.out.println(tree.searchValue(root, 100));

        //Test Recursion
/*        Recursive fibb = new Recursive();
        System.out.println(fibb.fib(4));
        System.out.println(fibb.fib(10));
        System.out.println(fibb.fib(20));
        System.out.println(fibb.fib(5));
        System.out.println(fibb.fib(100));*/
    }
}
