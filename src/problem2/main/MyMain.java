/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem2.main.BinarySearchTree;
import problem4.myqueue.MyQueue;
import problem2.main.BinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue();
        MyQueue postQueue = new MyQueue();
        BinarySearchTree binarySearchTree =  new BinarySearchTree(preQueue,postQueue);
        binarySearchTree.insert(19);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(20);
        binarySearchTree.printPreorder();
        binarySearchTree.printPostorder();
        System.out.println("PreOrder: ");
        preQueue.show();
        System.out.println("PostOrder: ");
        postQueue.show();
    }
}
