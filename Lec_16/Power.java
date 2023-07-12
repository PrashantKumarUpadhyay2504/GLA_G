package Lec_15;

public class Power {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println(power(a,b));
    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }


        int sp=power(a,b-1);
        return a*sp;
    }
}
