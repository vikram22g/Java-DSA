public class solution1{
    public static void main(String[] args){

       int flag=5;
        for(int i=0; i<+4;i++){
            for(int l=1; l<=flag-i; l++){
                System.out.print(" ");
            }
            for(int j=0; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}