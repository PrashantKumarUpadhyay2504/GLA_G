package Lec_2;

public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        while (row_no<=n){
            if(row_no==1 || row_no==n){
                int star=1;
                while(star<=n){
                    System.out.print("* ");
                    star=star+1;
                }
            }
            else{
                System.out.print("* ");
                int space=1;
                while(space<=n-2){
                    System.out.print("  ");
                    space=space+1;
                }
                System.out.print("* ");
            }
            row_no=row_no+1;
            System.out.println();
        }
    }
}
