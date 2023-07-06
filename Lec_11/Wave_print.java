package Lec_11;

public class Wave_print {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
    }
    public static void print(int arr[][]){
        for(int index=0;index<arr[0].length;index++){
            if(index%2==0){
                for(int row=0;row< arr.length;row++){
                    System.out.print(arr[row][index]+" ");
                }
            }
            else{
                for(int row= arr.length-1;row>=0;row--){
                    System.out.print(arr[row][index]+" ");
                }
            }
        }
    }
}
