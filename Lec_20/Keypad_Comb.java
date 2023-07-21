package Lec_20;

public class Keypad_Comb {
   static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        key("23","");
    }
    public static void key(String original,String ans){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }


        char ch=original.charAt(0);

        String res=arr[ch-48];

        for(int i=0;i<res.length();i++){
            char c=res.charAt(i);
            key(original.substring(1),ans+c);
        }

    }

}
