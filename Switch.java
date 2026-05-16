import java.util.*;
public class Switch {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("enter the number:");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("pizza");
            break;
            case 2:
            System.out.println("burger");
            break;
            case 3:
            System.out.println("dosa");
            break;
            default:
            System.out.println("vada");
        }
    }
}