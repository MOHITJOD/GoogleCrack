package Functions;

import java.util.*;

public class Pelindrom {
    public static boolean peli(int n){
        int m=n;
        int rev=0;
        while(n>0){
            int ld=n%10;
         rev = rev*10+ld;
           n=n/10;
        }
        if(rev==m){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int n=sc.nextInt();
      boolean ans = peli(n);
        if(ans==true){
            System.out.println("its palindrom haha.");
        }else{
            System.out.println("ohh noo, deviji shama kijiyega."
            );
        }
    }   
}
