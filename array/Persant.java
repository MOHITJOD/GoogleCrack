package array;
import java.util.*;
public class Persant {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int sum=0;
       int avg=0;
        int num[]=new int[3];
        for(int i=0;i<num.length;i++){
           System.out.print("enter your number:");
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            sum+=num[i];
           avg = sum/num.length;
        }
       System.out.println("Average of Three numbers is:"+avg); 
   } 
}
