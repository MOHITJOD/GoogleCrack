package Functions;
import java.util.*;
public class Swap {
    public static int[] swap(int a, int b){
        int c=a;
        a=b;
        b=c;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        swap(a, b);
        System.out.println("now a is:"+a);
        System.out.println("and b is:"+b);
    }
}
