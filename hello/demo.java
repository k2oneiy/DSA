package hello;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] inp = {9,5,7,1,6,2,8,4};
        inp = Sorting.mergeSort(inp);
        System.out.println(Arrays.toString(inp));

    }
    
}
