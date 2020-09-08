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

    public void deleteNode(TreeNode node, TreeNode prev, int value) {
        if(node != null){
            if(value < node.data) {
                prev = node;
                deleteNode(node.left, prev, value);
            } else if (value > node.data) {
                prev= node;
                deleteNode(node.right, prev, value);
            }
        }

        if(prev == null) prev = node;


        //0 attached nodes
        if (node.data == value) {
            if (node.left == null && node.right == null){
                System.out.println("node to delete with 0 nodes: " + node.data);
                if (prev.left == node) {
                    prev.left = null;
                } else {
                    prev.right = null;
                }
            }
                //1 attached node
            else if (node.left == null && node.right != null) {
                System.out.println("node to delete with 1 nodes: " + node.data);
                if (prev.left == node) {
                    prev.left = node.right;
                } else {
                    prev.right = node.right;
                }
            } else if (node.right == null && node.left != null) {
                System.out.println("node to delete with 1 nodes: " + node.data);
                if (prev.left == node) {
                    prev.left = node.left;
                } else {
                    prev.right = node.left;
                }
            }
            // 2 attached nodes
            else if (node.left != null && node.right != null) {
                System.out.println("node to delete with 2 nodes: " + node.data);
                TreeNode temp = findMin(node.right);
                TreeNode preTemp = findTemp(node.right, temp);
                node.data = temp.data;
                if(preTemp != null) {
                    if (temp.right != null)
                        preTemp.left = temp.right;
                    else
                        preTemp.left = null;
                } else {
                    node.right = null;
                }
            }
        }
    }

    private TreeNode findTemp(TreeNode node, TreeNode temp) {
        if (node.left == null)
            return null;
        else if (node.left == temp)
            return node;
        else
            return findTemp(node, temp);
    }

    private TreeNode findMin(TreeNode node) {
        if(node.left == null)
            return node;
        else return findMin(node.left);
    }
}
