package com.exercises.tests;

public class MyBinaryTree {

    public void insert(TreeNode node, int d) {
       if(d == node.data) {
           node.count++;
       } else if (d < node.data) {
           if(node.left == null) {
               node.left = new TreeNode(d);
               node.left.count = 1;
           } else {
               insert(node.left, d);
           }
       } else {
           if(node.right == null) {
               node.right = new TreeNode(d);
               node.right.count = 1;
           } else {
               insert(node.right, d);
           }
       }
    }

    public void traverseInOrder(TreeNode node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + "[" + node.count + "], ");
            traverseInOrder(node.right);
        }
    }
}
