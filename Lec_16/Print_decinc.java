package Lec_16;

public class Print_decinc {
    public static void main(String[] args) {
        int n=5;
        dci(n);
    }
    public static void dci(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        dci(n-1);
        System.out.println(n);
    }
}
