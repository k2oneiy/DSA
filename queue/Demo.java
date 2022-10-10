package queue;

public class Demo {
    public static void main(String[] args) {
        QueueUsingArray demo1 = new QueueUsingArray();
        demo1.enqueue(5);
        demo1.enqueue(10);
        System.out.println(demo1.dequeue());
        System.out.println(demo1.dequeue());
        System.out.println(demo1.dequeue());
        
        
    }
}
