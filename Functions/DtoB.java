package Functions;

public class DtoB {
    
    public static void dtob(int n){
        int bin=0;  
        int pow=0; 
        while(n>0){
                int num=n%2;
                bin += num*((int)Math.pow(10, pow));
                n=n/2;
                pow++;
            }
            System.out.println(bin);
    }
    public static void main(String[] args) {
        dtob(20);
    }
}
