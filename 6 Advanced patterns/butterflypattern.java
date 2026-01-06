public class butterflypattern{
    public static void main(String[] args){
        for(int i = 1; i<=4; i++){

            for(int j=1; j<=i; j++){      //top left part stars
                System.out.print("* ");
            }

            for(int k=1; k<=2*(4-i);k++){  // top middle part spaces
                System.out.print("  ");
            }

            for(int l=1; l<=i; l++){    //  top right part stars
                System.out.print("* ");
            }

            System.out.println();
        }


        for(int i = 4; i>=1; i--){ // i just flip the values of itration and value of index start

            for(int j=1; j<=i; j++){      //bottum left part stars
                System.out.print("* ");
            }

            for(int k=1; k<=2*(4-i);k++){  // bottum middle part spaces
                System.out.print("  ");
            }

            for(int l=1; l<=i; l++){    //  bottum right part stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}