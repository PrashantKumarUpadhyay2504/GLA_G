package Lec_11;

public class Return_type {
    public static void main(String[] args) {
        System.out.println(add(2,3));
    }
    public static int add(int a,int b){
        int c=a+b;
        System.out.println(subtract(3,b));
        return c;
    }
    public static int subtract(int a,int b){
        int d=a-b;
        return d;
    }
}
