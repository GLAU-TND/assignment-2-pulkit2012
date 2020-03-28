/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public TreeNode root;

    public MyBinarySearchTree insert(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            return this;
        }
        insertRec(root, node);
        return this;
    }

    private void insertRec(TreeNode latestRoot, TreeNode node) {
        if (latestRoot.value > node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
                return;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    private void printInOrderRec(TreeNode currRoot) {

        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + "  ");
        printInOrderRec(currRoot.right);
    }

    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    private void printPreOrderRec(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + "  ");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    private void printPostOrderRec(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.value + "  ");
    }

    private int countrr = 0;

    public int getCountrr() {
        return countrr;
    }

    public void setCountrr(int countrr) {
        this.countrr = countrr;
    }
    public void printLeft() {
        printLeftHelp(root);
        System.out.println("");
    }
    private void printLeftHelp(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + "  ");
        printLeftHelp(currRoot.left);
    }
    public int notChildCounter(){
        int counter1 = 0;
        int counter2 = 0;
        TreeNode current = root;
        while (current != null){
            if(current.left == null){
                counter1++;
            }
            current = current.left;
        }
        current = root;
        while (current != null){
            if(current.left == null){
                counter2++;
            }
            current = current.right;
        }
        return counter1 + counter2;
    }

}
