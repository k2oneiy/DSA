package Mwork;
import java.util.Scanner;

class DynamicArray{
    int intialcaptity = 16;
    private int arr[];
    private int size;
    DynamicArray(){
        size = 0;
        arr = new int[intialcaptity];
    }

    public void add(int value){
        arr[size++] = value;
    }
    public void display(){
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


public class Dynamic {
    public static void main(String[] args) {
        DynamicArray obj = new DynamicArray();
        int val;
		Scanner s = new Scanner(System.in);
		while(true){
	        System.out.println("1.Insert at End\n");
	        System.out.println("2.Display the list\n");
	        System.out.println("Enter your choice:\t");
	        int choice = s.nextInt();
	        switch(choice) {
	        case 1: System.out.print("Enter the data: ");
	                val = s.nextInt();
	                obj.add(val);
	                break;
	        case 2: obj.display();
	                break;
            default: System.out.println("Invalid Choice ");  
            }
        }
    }
}
