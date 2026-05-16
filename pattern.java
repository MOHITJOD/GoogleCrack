
public class pattern {
    // public static void main(String[] args) {
    //     for(int i=0;i<5;i++){
    //        for(int j=0;j<i;j++){
    //         System.out.print("*");                                   //hald right piramid
    //         // System.out.println();
    //        }
    //        System.out.println();
    //     }
    // }


    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }














}

