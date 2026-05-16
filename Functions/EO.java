package Functions;
import java.util.*;
public class EO {
    public static boolean eo(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your number:");
        int a=sc.nextInt();
        boolean eo= eo(a);
        if(eo==true){
            System.out.println(a+" is even.");
        }else{
            System.out.println(a+" is odd.");
        }
    }
}
