package Lec_2;

public class Pattern_13 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cstar=1;
        while(row_no<=(2*n-1)){
            int star=1;
            while(star<=cstar){
                System.out.print("* ");
               star=star+1;
            }
            if(row_no<n) {
                cstar = cstar + 1;
            }
            else{
                cstar=cstar-1;
            }
            row_no=row_no+1;
            System.out.println();
        }
    }
}
