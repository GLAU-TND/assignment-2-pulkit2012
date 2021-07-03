/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem4.myqueue.MyQueue;
import problem4.BinarySearchTree.MyBinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue myqueue = new MyQueue();
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree(myqueue);
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);
        binarySearchTree.insert(25);
        binarySearchTree.insert(2);
        binarySearchTree.printPreorder();
        myqueue.show();
    }
}
