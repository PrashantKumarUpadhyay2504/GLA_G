package Lec_14;

public class Good_substrings {
    public static void main(String[] args) {
        String str="aeiljkheeiozyteio";
        System.out.println(good(str));
    }
    public static int good(String s){
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowel(ch)){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return max;
    }
    public static boolean vowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
