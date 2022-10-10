package SQ;

public class Hello {
    public static void main(String[] args) {
        QueueUsingLinkedlist li = new QueueUsingLinkedlist();
        li.enqueue(5);
        li.enqueue(3);
        li.enqueue(6);
        li.enqueue(9);

        System.out.println(li.dequeue());
        System.out.println(li.dequeue());
        System.out.println(li.dequeue());
        System.out.println(li.dequeue());
        System.out.println(li.dequeue());


    }

}
