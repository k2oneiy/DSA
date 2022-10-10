package com.company;

import java.util.Arrays;

public class NewSort {
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

    public static void main(String[] args) {
        int[] arr = {7,4,8,1,3,5,9,2,6};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
