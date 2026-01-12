import java.util.*;

public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0; i<arr.length;i++){
            arr[i]=i;
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


        // input data in array from user

        int arr2[]= new int[5];
        for(int i=0; i<arr2.length;i++){
            System.out.print("enter number "+(i+1)+": ");
         arr2[i]=sc.nextInt();

        }
        for(int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }


        // linear search 
        System.out.print("What number do you want to search in array: ");
        int found=sc.nextInt();
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]==found){
                System.out.println(found+" is found at the index of: "+i);
            }
        }

    }
}