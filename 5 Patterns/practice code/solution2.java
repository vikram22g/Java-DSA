public class solution2{
    public static void main(String[] args){

        
       int flag=5;
        for(int i=0; i<=4;i++){
            for(int l=1; l<=flag-i; l++){
                System.out.print(" ");
            }
            for(int j=i+1; j>=1; j--){
                System.out.print(j);
            }
            for(int n=0; n<=i-1; n++){
                System.out.print(n+2);
            }
            System.out.println();
        }
    }
}