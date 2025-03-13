package com.ozan.day07_trees;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);
        System.out.println("Pre-order Traversal of The Tree");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In-order Traversal of The Tree");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post-order Traversal of The Tree");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level-order Traversal of The Tree");
        tree.levelOrderTraversal(tree.root);


    }
}
