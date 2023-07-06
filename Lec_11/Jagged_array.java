package Lec_11;

import java.util.Scanner;

public class Jagged_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[5][];
        for(int i=0;i< arr.length;i++){
            int n=sc.nextInt();
            arr[i]=new int[n];
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
