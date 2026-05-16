public class reverseNo {
public static void main(String[] args){
        int n=9462;
        int rev=0;
        // while(n>0){
        //     int a= n%10;
        //     rev=(rev*10)+a;
        //     n=n/10;
        // }
        // n=rev;
        // System.out.print(n);

        for(int i=n;i>0;i/=10){
            int a=i%10;
            rev=(rev*10)+a;
        }
        n=rev;
        System.out.println(n);

    }
}