package Lec_18;

public class Generate_paren {
    public static void main(String[] args) {
        int n=3;
        paren(n,n,"");
    }
    public static void paren(int open,int close,String ans){
        if(open==0 && close==0){
            System.out.println(ans);
            return;
        }

        if(open>close){
            return;
        }

        if(open>0){
            paren(open-1,close,ans+"(");
        }
        if(close>0){
            paren(open,close-1,ans+")");
        }
    }
}
