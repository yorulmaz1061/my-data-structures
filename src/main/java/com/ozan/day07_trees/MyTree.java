package com.ozan.day07_trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {

    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        //it is infinite while loop
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    //if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }
                // if left is not null branch into left subtree
                current = current.leftChild;

            }else {
                if (current.rightChild == null) {
                    //if right is null insert there!!
                    current.rightChild = newNode;
                    break;
                }
                // if right is not null branch into right subtree
                current = current.rightChild;
            }
        }

    }
    //Pre-order traversal Root->Left->Right
    void preOrderTraversal(TNode root) {
        if (root == null) return; //termination
        System.out.print(root.value + ","); //visit root
        preOrderTraversal(root.leftChild); //visit left subtree
        preOrderTraversal(root.rightChild); //visit right subtree
    }
    //In order traverse Left - Root - Right
    void inOrderTraversal(TNode root) {
        if (root == null) return; //termination. If we don't mention this, it will not end.
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ",");
        inOrderTraversal(root.rightChild);

    }
    //Post order traverse Left - Right - Root
    void postOrderTraversal(TNode root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ",");

    }
    //It uses while loop and queue structure not recursive method.
    void levelOrderTraversal(TNode root) {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<TNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //remove element from queue and assign it to temp. element called toVisit
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ",");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }


}
