package patterns;

public class InvertedStar {
    public static void main(String[] args) {
        // for(int i=5;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // for (int i=0;i<5;i++){
        //     for(int j=i;j<5;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

            for(int i=1;i<5;i++){
                for(int j=1;j<5-i+1;j++){
                    System.out.print("*");
                }System.out.println();
            }
        
    }
}
