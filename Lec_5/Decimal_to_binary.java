package Lec_7;

public class Decimal_to_binary {
    public static void main(String[] args) {
        int n=37;
        int multiplier=1;
        int ans=0;
        while(n!=0){
            int remainder=n%2;
            ans=ans+(multiplier*remainder);
            multiplier=multiplier*10;
            n=n/2;
        }
        System.out.println(ans);
    }
}
