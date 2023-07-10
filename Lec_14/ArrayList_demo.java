package Lec_14;

import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        //SIZE
        System.out.println(arr.size());
        //INSERT
        arr.add(10);
        arr.add(20);
        System.out.println(arr);
        //RANGE 0 to SIZE
        arr.add(1,30);
//        System.out.println(arr);
//        System.out.println(arr.size());

        //DELETE
        //RANGE 0 to SIZE-1
//        System.out.println(arr.remove(1));
//        System.out.println(arr);

        //GET
        arr.add(19);
        arr.add(29);
//        System.out.println(arr.get(1));

        //SET
//        System.out.println(arr);
        arr.set(1,15);
//        System.out.println(arr);

        //ITERATE
//        for(int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//        }
        //FOR EACH LOOP
        for(Integer i:arr){
            System.out.println(i);
        }

    }
}
