package Lec_3;

public class Pattern_26 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cspace=n-1;
        int cnumber=1;
        while(row_no<=n){
            int space=1;
            while(space<=cspace){
                System.out.print("  ");
                space=space+1;
            }
            int number=1;
            int value=1;
            while(number<=cnumber){
                System.out.print(value+" ");
                number=number+1;
                value=value+1;
            }
            cspace=cspace-1;
            cnumber=cnumber+2;
            row_no=row_no+1;
            System.out.println();
        }
    }
}
