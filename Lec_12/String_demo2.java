package Lec_12;

public class String_demo2 {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";
        System.out.println(str==str1);//address compare
        String st=new String("Hello");
        String st1=new String("Hello");
        System.out.println(st==str);
        System.out.println(st==st1);
        String s="Hel";
        s=s+"lo";
        System.out.println(str==s);

        System.out.println(str.equals(st));//CONTENT COMPARE
    }
}
