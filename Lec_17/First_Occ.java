package Lec_17;

public class First_Occ {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,2,1};
        int target=3;
        System.out.println(first(arr,0,target));
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
