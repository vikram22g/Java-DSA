public class solid_rhombus{
    public static void main(String[] args){
        int n=5;

        for(int i=n; i>=1; i--){

            for(int j=1; j<=i; j++){   // spaces
                System.out.print(" ");
            }

            for(int k=1; k<=n; k++){   // stars pattern
                System.out.print("*");
            }
            System.out.println();
        }
    }
}