package problem3.LinkedList;
import problem3.node.Node;
import problem3.Student.Students;
public class MyLinkedList {
    private Node first;
    private Node last;
    public void addAfter(Students student){
        Node newNode =new Node(student);
        if(first == null){
            first = last = newNode;
        }
        last.setNext(newNode);
        last = newNode;
        var current = first;
        while (current != null){
            if(newNode.getData().getRollNo() < current.getData().getRollNo()){
                var temp = newNode.getData();
                newNode.setData(current.getData());
                current.setData(temp);
            }
            current = current.getNext();
        }
    }
    public void deleteFirst(){
        if(first == null){
            first = last = null;
        }
        var after = first.getNext();
        first.setNext(null);
        first = after;
    }
    public void display(){
        var temp = first;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

