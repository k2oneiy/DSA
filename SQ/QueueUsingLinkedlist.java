package SQ;

public class QueueUsingLinkedlist {
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    Node front,rear;

    QueueUsingLinkedlist(){
        front = null;
        rear = null;
    }

    public void enqueue(int val){
        Node newnode = new Node(val);
        if(front==null)
            front = newnode;
        else
            rear.next = newnode;
        rear = newnode;
    }

    public int dequeue(){
        if(front==null)
            throw new IndexOutOfBoundsException("Queue is empty");
        int temp = front.data;
        front = front.next;
        if(front==null)
            rear=null;
        return temp;
    }

}
