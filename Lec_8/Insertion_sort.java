package Lec_9;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[]){
        for(int i=1;i< arr.length;i++){
            int j=i-1;
            int item=arr[i];
            while (j>=0 && item<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
    }
}
