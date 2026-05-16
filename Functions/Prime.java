package Functions;

public class Prime {
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
        if(prime(9)){
            System.out.println("Its prime;");
        }else{
            System.out.println("its not prime!");
        }
    }
}
