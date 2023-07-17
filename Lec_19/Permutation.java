package Lec_19;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        perm("",str);
    }
    public static void perm(String ans,String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<original.length();i++){
            char ch=original.charAt(i);

            String ros=original.substring(0,i)+original.substring(i+1);
            perm(ans+ch,ros);
        }
    }
}
