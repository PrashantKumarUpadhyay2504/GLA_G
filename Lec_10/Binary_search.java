package Lec_10;

public class Binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        binary(arr,8);
    }
    public static void binary(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
