package Lec_19;

public class Climbing_Stairs {
    public static void main(String[] args) {
        climb(3,"");
    }
    public static void climb(int n,String ans){
        if(n<0){
            return;
        }


        if(n==0){
            System.out.println(ans);
            return;
        }


        climb(n-1,ans+"1");
        climb(n-2,ans+"2");
        climb(n-3,ans+"3");

    }
}
