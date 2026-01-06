public class palindromic_pattern{
    public static void main(String[] args){

        int n=5;

        for(int i=1; i<=n; i++){
            for(int k=n-i; k>=1; k--){  // spaces
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){ // first half
                System.out.print(j);
            }
            for(int l=2; l<=i; l++){  // second half
                System.out.print(l);
            }
            System.out.println();
        }
    }
}