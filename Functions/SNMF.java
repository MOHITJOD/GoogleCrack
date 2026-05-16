package Functions;

public class SNMF {
    public static void a(int a){
        System.out.println("this is a" +a);
    }
    public static void a(float b){
        System.out.println("this is b" + b);
    }public static void a(double c){
        System.out.println("this is c" +c);
    }


    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
   
    public static void main(String[] args) {
        a(333333333234234d);
       a(3.33f);
        a(3);

        sum(3,4);
        sum(4,5,3);


    }
}
