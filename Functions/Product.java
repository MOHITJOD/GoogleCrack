package Functions;

public class Product {

    public static int product(int a, int b) {

        int result = a * b;

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {

      int a=  product(3,5);
System.out.println(a);
    }
}