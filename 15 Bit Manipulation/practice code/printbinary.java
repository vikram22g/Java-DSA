import java.util.*;

public class printbinary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int arr[]=new int[4];

        for(int i=0; i<arr.length; i++){
            int bitmask = 1<<i;

            if((bitmask & num)==0){
                arr[arr.length-i-1]=0; // storing the bit in array 
            }
            else{
                arr[arr.length-i-1]=1; // storing the bit in array
            }
        }


        System.out.print("The binary format of number "+num+" is: ");
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}