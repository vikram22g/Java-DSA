import java.util.*;

public class BubbleSort{
    public static int[] Bsort(int arr[]){

        for(int i=0; i<arr.length-1; i++){

            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){
                    // swaping
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        return arr;
    }
    public static void main(String args[]){
        int arr1[]={3,5,4,2,1};
        int arr2[]=Bsort(arr1);

        //Printing swapped array
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }
    }
}