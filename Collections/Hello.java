package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Hello {
    public static void main(String[] args) {
        LinkedList<Integer> items = new LinkedList<Integer>();
        items.addFirst(1);
        items.addFirst(20);
        System.out.println(items);

        PriorityQueue<String> students = new PriorityQueue<String>();
        students.add("Vel");
        students.add("Deepak");
        students.add("Arun");
        System.out.println(students.peek());
    }
}
