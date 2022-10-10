package stack;
// last in first out 
// for an example plats

public class ArrayStack <T> {
    final static int max_size = 30;
    T arr[] = (T[]) new Object[max_size];
    
    int top;
    ArrayStack(){
        top = -1;

    }
    void push(T val){
        if(top==max_size-1){
            throw new IndexOutOfBoundsException("stack is full");
        }
        arr[++top] = val;
    }

    T pop(){
        if(top==-1){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return arr[top--];
    }
    T peek(){
        return arr[top];
    }




}
