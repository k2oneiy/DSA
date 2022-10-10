package Hello;

public class Demo {
    public static void main(String[] args) {
        CircularLinkedList<String> li = new CircularLinkedList<>();
        li.insertAtBegining("vel");
        li.insertAtBegining("delip");
        li.deleteAtEnd();
        li.display();
    }
}
