import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do {
        // System.out.print("enter your number: ");
        // int n = sc.nextInt();
        // if (n%10==0){
        // continue;
        // }
        // System.out.println("number was: "+ n);
        // }while(true);

        do{
            System.out.print("enter any number:");
            int i= sc.nextInt();
            if(i%10==0){
                System.out.println("nonono!");
                    continue;
            }
            System.out.println( "you entered: "+ i);
        }while(true);

    }
}