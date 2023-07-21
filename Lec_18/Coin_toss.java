package Lec_18;

public class Coin_toss {
    public static void main(String[] args) {
        int n=3;
        coin(n,"");
    }
    public static void coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        //HEAD
        coin(n-1,ans+"H");
        //TAIL
        coin(n-1,ans+"T");
    }
}
