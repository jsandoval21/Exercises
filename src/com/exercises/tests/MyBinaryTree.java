package com.exercises.tests;

public class MyBinaryTree {

    public void insert(TreeNode node, int value) {
       if(value == node.data) {
           node.count++;
       } else if (value < node.data) {
           if(node.left == null) {
               node.left = new TreeNode(value);
               node.left.count = 1;
           } else {
               insert(node.left, value);
           }
       } else {
           if(node.right == null) {
               node.right = new TreeNode(value);
               node.right.count = 1;
           } else {
               insert(node.right, value);
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

   public void traversePostOrder(TreeNode node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + "[" + node.count + "], ");
        }
    }

   public void traversePreOrder(TreeNode node) {
       if (node != null) {
           System.out.print(node.data + "[" + node.count + "], ");
           traversePreOrder(node.left);
           traversePreOrder(node.right);
       }
    }

    public boolean searchValue(TreeNode node, int value) {
        if(node == null)
            return false;

        if(value == node.data)
            return true;
        else if (value < node.data)
            return searchValue(node.left, value);
        else
            return searchValue(node.right, value);
    }
}
