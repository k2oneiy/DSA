package com.company;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head = null;
    }

}
