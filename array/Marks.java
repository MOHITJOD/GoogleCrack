package array;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        // for(int i=0;i<3;i++){   
        // System.out.print("enter your marks:");
        //     marks[i]=sc.nextInt();
        // }
        marks[0]=6;
        marks[1]=3;
        marks[2]=5;
        // marks[3]=2;
        // marks[4]=3;
        System.out.println("you entered these marks:");
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        marks[2]=33;
        System.out.println(marks[2]);
    }
}
