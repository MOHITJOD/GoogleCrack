package Functions;


public class Bino {
   public static void main(){
           int n=5;
           int r=2;
         
   int a= fac(n);
    int b= fac((n-r));
    int c=fac(r);
         int bi= a/(b*c);
            System.out.println(bi);

   }

   public static int fac(int a){
    int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
    return fac;
}

}



