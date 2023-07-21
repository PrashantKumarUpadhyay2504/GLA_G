package Lec_15;

public class First_Occ {
    public static void main(String[] args) {
        int arr[]={1,2,31,23,3,5,6,7,3,2,3};
        System.out.println(first(arr,0,3));;
    }
    public static int first(int arr[],int i,int target){
        if(i== arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }
        return first(arr,i+1,target);
    }
}
