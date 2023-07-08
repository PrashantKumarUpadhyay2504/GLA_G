package Lec_13;

public class Palin_substrings {
    public static void main(String[] args) {
        String str="nitin";
        sub(str);
    }
    public static void sub(String str){
        for(int start=0;start<str.length();start++){
            for(int end=start;end<=str.length();end++) {
                if (palin(str.substring(start, end))) {
                    System.out.println(str.substring(start, end));
                }
            }
        }
    }
    public static boolean palin(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
