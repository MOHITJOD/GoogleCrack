package loopQuestions;
import java.util.*;
public class EvenOddSum {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int even=0;
    int odd=0;
    int choice;
    int num;
    do{
        System.out.print("enter any number:");
        num=sc.nextInt();
        if(num%2==0){
            even+=num;
        }else{
            odd+=num;
        }
System.out.println("do you want to continue? press 1 for 'yes' and 0 for 'no'.");
        choice=sc.nextInt();

    }while(choice==1);
System.out.println("sum of all even numbers is: "+even);
System.out.println("sum of all odd numbers is: "+odd);
}
}
