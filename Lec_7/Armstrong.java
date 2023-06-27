package Lec_7;

public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int count=count_digits(n);
        if(armstrong(n,count)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static int count_digits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean armstrong(int n,int count){
        int ans=0;
        int backup=n;
        while(n!=0){
            int dig=n%10;
            ans=ans+(int)Math.pow(dig,count);
            n=n/10;
        }
        return backup==ans;
    }
}
