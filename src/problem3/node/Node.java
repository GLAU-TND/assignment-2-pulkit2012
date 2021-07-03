/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;
import problem3.Student.Students;
public class Node<E> {
    private Students data;
    private Node next;

    public Node(Students data) {
        this.data = data;
        this.next = null;
    }

    public Students getData() {
        return data;
    }

    public void setData(Students data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

