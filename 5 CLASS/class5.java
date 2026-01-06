public class class5{
    public static void main(String[] args){



        // for(int i=1; i<=4; i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }



        // for(int i=1; i<=4; i++){
        //     for(int j=1;j<=5;j++){
        //        if(i==1||i==4){
        //         System.out.print("*");
        //        }
        //        else{
        //          if(j==1||j==5){
        //         System.out.print("*");

        //         }
        //         else{
        //         System.out.print(" ");

        //         }
        //        }
        //     }
        //     System.out.println("");
        // }


        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }



        // for(int i=4;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        int flag=4;
        for(int i=1;i<=4;i++){
            for(int l=0;l<=flag-i;l++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        // for(int i=1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }



        // for(int i=5; i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }


        // int counter=1;
        // for(int i=1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(counter+" ");
        //         counter=counter+1;
        //     }
        //     System.out.println(" ");
        // }



        // for(int i=1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){

        //         System.out.print(1);
        //         }
        //         else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println(" ");
        // }
    }
}