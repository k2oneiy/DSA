package Hello;

public class DoublyLinkedList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtBegining(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        if(head==null){
            head = newnode;
            tail = newnode;
        }
        else{
            head.prev = newnode;
        }
        head = newnode;
    }

    public void printLinkedList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(" "+temp.data+" ");
            temp = temp.next;
        }
    }

    public void insertAtPosition(int pos,int val){
        if(pos==0){
            insertAtBegining(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for (int i=1;i<pos-1;i++){
            temp = temp.next;
            if(temp==null){
                throw new IllegalArgumentException("Invalid Position");
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deleteAtPosition(int pos){
        Node temp = head;
        Node prev = null;

        if(pos==0){
            deleteAtBegining();
            return;
        }
        for (int i=1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void deleteAtBegining(){
        if(head==null){
            throw new IndexOutOfBoundsException("Invalid Position");
        }
        head = head.next;
    }

    public boolean contains(int val){
        Node temp = head;
        while (temp!=null){
            if(temp.data==val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}







