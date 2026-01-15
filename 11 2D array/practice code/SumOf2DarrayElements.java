import java.util.*;

public class SumOf2DarrayElements{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);


        int arr[][]={{32,44,24},{3,44,2}};
        int sum=0;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);

    }
}