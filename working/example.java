package working;
public class example {
    public static void main(String[] args) {
        System.out.println("iyappan");
        System.out.println(" ");
        System.out.println("2D array");
        int[][] arr = new int[3][3];
        int count = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count;
                count++; 
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
