package SQ;

import java.util.Arrays;

public class Demo {
    public static int[] SortArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
