package sort;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        Home.selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
