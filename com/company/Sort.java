package com.company;

import java.util.Arrays;

public class Sort {
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int midIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[midIndex]){
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
    }

    public static void Bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swamped = false;
            for (int j=0;j<arr.length-1;j++){
                swamped = true;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swamped){
                break;
            }
        }
    }

    public static void InsertionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j>0;j--){
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
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
