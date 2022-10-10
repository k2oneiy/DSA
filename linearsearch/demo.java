package linearsearch;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int array[] = {7,8,4,5,2,1};
        System.out.println(linearsearch.find(array, 3));
        System.out.println(linearsearch.contain(array, 10));
        System.out.println(linearsearch.find("iyappan", 'n'));
        System.out.println(linearsearch.contain("iyappan", 'b'));

        int[][] arraytwo = {
            {8,3,4},
            {5,3,4},
            {5,1,2}
        };
        int res[] = linearsearch.find(arraytwo, 9);
        System.out.println(Arrays.toString(res));
    }
}
