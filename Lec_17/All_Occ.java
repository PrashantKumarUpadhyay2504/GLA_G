package Lec_17;

import java.util.Arrays;

public class All_Occ {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,2,1};
        int target=3;
        System.out.println(Arrays.toString(all(arr,0,target,0)));
    }
    public static int[] all(int arr[],int i,int target,int count){
        if(i==arr.length){
            return new int[count];
        }


        if(arr[i]==target){
            int ans[]=all(arr,i+1,target,count+1);
            ans[count]=i;
            return ans;
        }
        else{
            int ans[]=all(arr,i+1,target,count);
            return ans;
        }
    }
}
