import java.util.*;

public class example {

    public static void main(String[] args) {
        int[] arr = {5,7,3,9,8,2,4,1,6};
        QuickSort.quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
