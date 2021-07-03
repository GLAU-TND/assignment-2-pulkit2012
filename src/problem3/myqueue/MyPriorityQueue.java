/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.LinkedList.MyLinkedList;
import problem3.Student.Students;
public class MyPriorityQueue {
    MyLinkedList linkedList = new MyLinkedList();
    public void enqueue(Students student){
        linkedList.addAfter(student);
    }
    public void dequeue(){
        linkedList.deleteFirst();
    }
    public void show(){
        linkedList.display();
    }
}
