package Lec_12;

public class Spiral_print {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr);
    }
    public static void spiral(int arr[][]){
        int sr=0;
        int sc=0;
        int er= arr.length-1;
        int ec=arr[0].length-1;
        int total= arr.length*arr[0].length;
        int count=0;
        while(count<total){
            //PART 1
            for(int i=sr;i<=er&&count<total;i++){
                System.out.print(arr[i][sc]+" ");
                count++;
            }
            sc++;
            //PART 2
            for(int i=sc;i<=ec&&count<total;i++){
                System.out.print(arr[er][i]+" ");
                count++;
            }
            er--;
            //PART 3
            for(int i=er;i>=sr&&count<total;i--){
                System.out.print(arr[i][ec]+" ");
                count++;
            }
            ec--;
            //PART 4
            for(int i=ec;i>=sc&&count<total;i--){
                System.out.print(arr[sr][i]+" ");
                count++;
            }
            sr++;

        }
    }
}
