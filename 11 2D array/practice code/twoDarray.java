import java.util.*;

public class twoDarray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // taking input from user that how much rwos and columns he want
        System.out.print("Enter rows that you want to enter: ");
        int row=sc.nextInt();
        System.out.print("Enter columns that you want to enter: ");
        int col=sc.nextInt();

        // taking input 
        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // printing 2D array
        System.out.println("Your 2D Array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}