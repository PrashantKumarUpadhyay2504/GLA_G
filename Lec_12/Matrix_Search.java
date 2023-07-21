package Lec_12;

public class Matrix_Search {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(matrix(arr,0));
    }
    public static int matrix(int arr[][],int target){
        int row=0;
        int col=arr[0].length-1;
        while(col>=0 && row< arr.length){
            if(arr[row][col]==target){
                return 1;
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return -1;
    }
}
