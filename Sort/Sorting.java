package Sort;

import java.sql.Array;
import java.util.Arrays;

public class Sorting {
    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIdem = i;
            int temp = arr[i];
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[minIdem]){
                    minIdem = j;
                }
            }
            arr[i] = arr[minIdem];
            arr[minIdem] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,9,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
