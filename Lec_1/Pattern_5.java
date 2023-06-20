package Lec_1;

public class Pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cspace=0;
        int cstar=n;
        while(row_no<=n){
            int space=1;
            while(space<=cspace){
                System.out.print("  ");
                space=space+1;
            }
            int star=1;
            while(star<=cstar){
                System.out.print("* ");
                star=star+1;
            }
            cstar=cstar-1;
            cspace=cspace+1;
            row_no=row_no+1;
            System.out.println();
        }
    }
}
