package Lec_12;

public class String_demo3 {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.charAt(1));

////        System.out.println(str);
////        str=str+"l";
//        System.out.println(str);
        System.out.println(str.substring(1,5));

        String s="there";

        System.out.println(str.concat(s));

        String st="Hel";
        if(str.compareTo(st)>0){
            System.out.println(str);
        }
        else{
            System.out.println(st);
        }
    }
}
