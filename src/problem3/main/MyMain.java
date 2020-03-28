/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.Student.Students;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Students("Pulkit",19));
        queue.enqueue(new Students("Himanshu",12));
        queue.enqueue(new Students("Ayush",8));
        queue.enqueue(new Students("Ritik",20));
        queue.show();
        queue.dequeue();
        queue.show();
    }
}
