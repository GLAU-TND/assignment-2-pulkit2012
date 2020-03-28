/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(15);
        bst.insert(10);
        bst.insert(50);
        bst.insert(55);
        bst.insert(60);
        System.out.println("Left children of the binary search tree: ");
        bst.printLeft();
        System.out.println("No.of Parents not having their left child are:");
        bst.notChildCounter();
        System.out.println(bst.notChildCounter());

    }
}

