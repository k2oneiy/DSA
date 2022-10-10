package debug;
import java.lang.reflect.Array;
import java.util.Arrays;

class Check {
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex = arr[i];
            for(int j=i+1;j<arr.length;i++){
                if(arr[j]<minindex){
                    minindex = arr[j];
                }
            }
        int temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionsort(arr);
    }
    
}
