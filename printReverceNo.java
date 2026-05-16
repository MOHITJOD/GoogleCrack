
public class printReverceNo {
    public static void main(String[] args) {
        int a = 31072003;
        // while ( a > 0 ){
        //     System.out.print(a%10);
        //     a=a/10;
        // }

        // for(int i=56; i>0 ; i--){
        //     System.out.print(i%10);  //printing 64
        //     i=i/10;
        // }

        int i =77823;
        // for (int n = i; n > 0; n /= 10) {
        //     System.out.print(n % 10);         //printing the reverse using for loop.
        // }
   

        while (i>0) {
            System.out.print(i%10); 
            i/=10;
        }
         
    
    
    }
}
