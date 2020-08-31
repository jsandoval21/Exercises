package com.exercises.tests;

public class TreeNode {
    int data;
    int count;              //keep count of how often a value occurs
    TreeNode left, right;

    TreeNode(int d){
        this.data = d;
        left = right = null;
        this.count = 1;
    }
}
