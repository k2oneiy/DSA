package stack;

public class StackUsingLinkedlist<T> {
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    Node top;
    StackUsingLinkedlist(){
        top=null;
    }
    public void push(T val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }
    public T pop(){
        if(top==null){
            throw new IndexOutOfBoundsException("stack is empty");
        }
        T tmp = top.data;
        top = top.next;
        return tmp;
    }

    
}
