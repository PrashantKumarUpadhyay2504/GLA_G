package Lec_15;

public class Print_Dec {
    public static void main(String[] args) {
        int n=5;
        dec(n);
    }
    public static void dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}
