package Lec_21;

public class Lexico {
    public static void main(String[] args) {
        lex(0,15);
    }
    public static void lex(int curr,int end){
        if(curr>end){
            return;
        }

        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }

        for(;i<=9;i++){
            lex(curr*10+i,end);
        }
    }
}
