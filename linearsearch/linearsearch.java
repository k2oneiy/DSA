package linearsearch;

public class linearsearch {
    public static int find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public static boolean contain(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }
    public static int find(String val, char target){
        for(int i=0;i<val.length();i++)
            if(val.charAt(i) == target)
                return i;
            return -1;      
    }
    public static boolean contain(String val, char target){
        for(int i=0;i<val.length();i++)
            if(val.charAt(i) == target)
                return true;
            return false;      
    }
    public static int[] find(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target)
                    return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
    
}
