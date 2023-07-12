package Lec_15;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }


        int sp1=fibo(n-1);
        int sp2=fibo(n-2);
        return sp1+sp2;
    }
}
