package Functions;

public class BtoD {
    public static void btod(int n){
        int dec=0;
        int pow=0;
        
        while (n>0){
                    int ld=n%10;
                    dec = dec + (ld * (int)Math.pow(2, pow));
                    pow++;
                    n=n/10;
        }
        System.out.println("decimal is :"+dec
        );
    } 
    public static void main(String[] args) {
        btod(101);
    }
}
