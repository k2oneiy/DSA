package LinkedList;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }

    public void insertAtBegining(int val){
        Node newNode = new Node(val);
        if(head==null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }    
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void insertAtpos(int pos,int val){
        if(pos==0){
            insertAtBegining(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<=pos;i++){
            temp = temp.next;
            if(temp==null){
                throw new IllegalArgumentException("Postion invaild");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
