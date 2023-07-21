package Lec_13;

public class Substrings {
    public static void main(String[] args) {
        String str="Hello";
        sub(str);

    }
    public static void sub(String str){
        for(int start=0;start<str.length();start++){
            for(int end=start;end<=str.length();end++){
                System.out.println(str.substring(start,end));
            }
        }
    }
}
