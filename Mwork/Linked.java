package Mwork;


class LinkedList{
    Node head;
    static class Node{
        int value;
        Node next;
        Node(int val){
            value = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.head = new Node(10);
        Node second = new Node(9);
        Node third = new Node(5);
        Node fourth = new Node(3);

        linkedlist.head.next = second;
        second.next = third;
        third.next = fourth;
        

        System.out.println("Linked list : ....");
        while(linkedlist.head !=null){
            System.out.print(linkedlist.head.value +" ");
            linkedlist.head = linkedlist.head.next;
        }

    } 
}



