package patterns;

public class HalfPiraNo {
    public static void main(String[] args) {
       
        // for(int i=1;i<5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }System.out.println();
        // }
        char ch='A';
        int n=8;
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(ch);
                    ch++;
                }System.out.println();
            }

    }
}
