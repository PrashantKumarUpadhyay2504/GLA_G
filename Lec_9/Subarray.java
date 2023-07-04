package Lec_9;

public class Subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        subarray(arr);
//        subarray1(arr);
        subarray2(arr);
    }
    public static void subarray(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int start=0;start< arr.length;start++){
            for(int end=start;end<arr.length;end++){
                int sum=0;
                for(int i=start;i<=end;i++){
                    sum+=arr[i];
                    System.out.print(arr[i]+"  ");
                }
                max=Math.max(max,sum);
                System.out.print("------->"+sum);
                System.out.println();
            }
        }
        System.out.println(max);
    }
    public static void subarray1(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int start=0;start< arr.length;start++){
            int sum=arr[start];
            for(int end=start+1;end<arr.length;end++){
                sum+=arr[end];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
    public static void subarray2(int arr[]){
        int curr_amount=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            curr_amount+=arr[i];
            max=Math.max(curr_amount,max);
            if(curr_amount<0){
                curr_amount=0;
            }
        }
        System.out.println(max);
    }
}
