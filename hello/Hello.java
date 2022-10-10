package hello;
import java.util.Arrays;   

public class Hello {
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
        int temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
        }
    }

    // select bubble elements and change the values 
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swipped = true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[i+1]){
                    swipped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
        }
        if(!swipped){
            break;
        }
        }
    }

    // insertion sort       
    // example : card inserting 

    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void  quicksort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)   
                end--;
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }


    public static void main(String[] args) {
        // System.out.println("hi");
        // int arr[] = {5,4,3,8,1};
        // System.out.println(Arrays.toString(arr));
        // Hello.selectionsort(arr);
        // Hello.insertionsort(arr);
        // System.out.println(Arrays.toString(arr));
        int[] arr = {5,7,3,9,8,2,4,1,6};
        Hello.quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
