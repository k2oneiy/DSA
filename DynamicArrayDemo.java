



import java.util.*;


class DynamicArray{
    private static final int intialcaptity = 16;
    private int arr[];
    private int size;
    private int capcity;
    DynamicArray(){
        size = 0;
        arr = new int[intialcaptity];
        capcity = intialcaptity;
    }

    public void add(int val){
        if(size==capcity){
            expendArray();
        }
        arr[size++] = val;
    }

    private void expendArray(){
        capcity = capcity*2;
        arr = java.util.Arrays.copyOf(arr, capcity);
    }

    public void display(){
        System.out.println("Elements in the list");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void insertAtPos(int pos , int val){
        if(size==capcity)
            expendArray();
        for(int i=size-1;i>=pos;i--)
            arr[i+1] = arr[i];
        arr[pos]=val;
        size++;
    }

    public void deleteAtPos(int pos){
        for(int i = pos+1;i<size;i++)
            arr[i-1] = arr[i];
        size--;
        
        if(capcity > intialcaptity && capcity > 3*size){
            shrinkArray();
        }
    }

    private void shrinkArray(){
        capcity = capcity/2;
        arr = java.util.Arrays.copyOf(arr, capcity);
    }

    public int lenght(){
        return size;
    }

    public void update(int pos,int uval){
        arr[pos] = uval;
    }


}

class DynamicArrayDemo{
    public static void main(String[] args) {
        int val , pos , uval;
        DynamicArray list = new DynamicArray();
        Scanner scanner = new Scanner(System.in);
        while(true) {
			System.out.println("\n -------- List Menu -----------\n");
	        System.out.println("1.Insert at End\n");
	        System.out.println("2.Display the list\n");
	        System.out.println("3.Insert at specified position \n");
	        System.out.println("4.Delete from specified position\n");
            System.out.println("6.Update the value\n");
	        System.out.println("5.Exit\n");
	        System.out.println("\n--------------------------------------\n");
	        System.out.println("Enter your choice:\t");
	        int choice = scanner.nextInt();
            switch(choice) {
                case 1: System.out.print("Enter the data: ");
                    val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2: list.display();
                    break;
                case 3: System.out.println("Enter the pos(starts at 0): ");
                    pos = scanner.nextInt(); 
                    if(pos<0){
	                    System.out.println("Invalid position");
	                    break;
	                }
                    System.out.print("Enter the data: ");
                    val = scanner.nextInt();
                    list.insertAtPos(pos,val);
                    break;   

                    
                case 4: System.out.println("Enter the pos(starts at 0): ");
                    pos = scanner.nextInt();
                    if(pos<0){
	                    System.out.println("Invalid position");
	                    break;
	                }
                    list.deleteAtPos(pos);
                    break;

                case 5: System.exit(0);
                case 6:
                    System.out.println("Enter your Position");
                    pos = scanner.nextInt(); 
                    if(pos<0){
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.print("Enter the data: ");
                    uval = scanner.nextInt();
                    list.update(pos, uval);

                default: System.out.println("Invalid Choice ");
                }
        }
        
    }
}