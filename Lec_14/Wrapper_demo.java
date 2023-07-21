package Lec_14;

public class Wrapper_demo {
    public static void main(String[] args) {
        Integer a=100;
        int a1=10;
//        System.out.println(a);
//        System.out.println(a1);


        a1=a;  /*int------>Integer AUTOBOXING
        */

//        System.out.println(a1);


        Integer i=100;
        int ii=10;
        i=ii;  /*Integer------>int UNBOXING */

        //-128 --> 127

        Integer b1=19;
        Integer b2=19;
        System.out.println(b1==b2);
        Integer b3=190;//2K
        Integer b4=190;//4K
        System.out.println(b3==b4);
    }
}
