package Lec_15;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        int sp=factorial(n-1);
        return n*sp;
    }
}
