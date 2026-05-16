package Functions;

public class PrintPrime {
    public static void prime(int a,int b){
       if(a==2){
        System.out.println(a);
       }
        for(int i=a;i<b;i++){
           if(prime(i)){
            System.out.println(i);
           }
            else{
                continue;
            }
        }
    }

    public static boolean prime (int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        prime(2,9999);
    }
}
 