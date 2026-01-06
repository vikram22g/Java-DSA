public class number_pyramid{
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){

            for(int k=n-i; k>=0; k--){  // left spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){   // number pyramid
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}