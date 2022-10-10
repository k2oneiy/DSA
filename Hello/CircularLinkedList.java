package Hello;

public class CircularLinkedList<T> {
    Node last;
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    CircularLinkedList(){
        last = null;
    }
    public void insertAtBegining(T val){
        Node newnode = new Node(val);
        if(last==null){
            newnode.next = newnode;
            last = newnode;
        }
        else{
            newnode.next = last.next;
            last.next = newnode;
        }
    }
    public void insertAtEnd(T val){
        Node newnode = new Node(val);
        if(last==null){
            newnode.next = newnode;
            last = newnode;
        }
        else{
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }

    public void display(){
        if (last==null)
            return;
        Node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp!=last.next);
    }
    public T deleteAtBegining(){
        if(last==null)
            throw new IndexOutOfBoundsException("Empty list");
        T temp = last.next.data;
        if(last.next==last)
            last = null;
        else
            last.next = last.next.next;
        return temp;
    }
    public void deleteAtEnd() {
        if (last == null)
            throw new IndexOutOfBoundsException("Empty list");
        if (last.next == last)
            last = null;
        else {
            Node temp = last.next;
            while (temp.next!=last){
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }
}
