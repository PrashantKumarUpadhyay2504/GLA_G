package Lec_11;

public class Square_root {
    public static void main(String[] args) {
        square(50);
    }
    public static void square(int n){
        int ans=-1;
        int start=1;
        int end=n/2;
        while(start<=end){
            int middle=start+(end-start)/2;
            if((middle*middle)<=n){
                ans=middle;
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        System.out.println(ans);
    }
}
