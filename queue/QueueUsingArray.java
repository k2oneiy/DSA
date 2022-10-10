package queue;
class QueueUsingArray{
    static final int MAX_SIZE = 30;
    int arr[];
    int front,rear;


    QueueUsingArray(){
        arr = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int val){
        if(rear == MAX_SIZE-1)
            throw new IndexOutOfBoundsException("Queue is full");
        if(front==-1)
            front++;
        arr[++rear]=val;
    }


    public int dequeue(){
        if(front==-1 || front>rear)
            throw new IndexOutOfBoundsException("Queue is Empty");
        return arr[front++];
    }



   
}