public class diamond_pattern{
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){

            for(int j=n-i; j>=1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=1; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){

            for(int j=n-i; j>=1; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=1; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}