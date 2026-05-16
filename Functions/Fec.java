package Functions;

public class Fec {
    public static int fac(int a){
        int fac=1;        
        for(int i=1;i<=a;i++){
            fac=fac*i;
                }
                return fac;
    }
    public static void main(String[] args) {
        System.out.println(fac(7));
    }
}
