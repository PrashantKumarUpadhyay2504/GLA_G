package Lec_18;

public class Subsequence {
    public static void main(String[] args) {
        String str="abc";
        sub("",str);
    }
    public static void sub(String ans,String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=original.charAt(0);
        //INCLUDE
        sub(ans+ch,original.substring(1));
        //EXCLUDE
        sub(ans+"",original.substring(1));
    }
}
