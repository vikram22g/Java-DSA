// Sum of all array elements

import java.util.*;

public class SumOfArray{
    public static void main(String args[]){
        int arr[]={33,98,5,26,7};
        int temp=0;
        for(int i=0; i<arr.length; i++){
            temp=temp+arr[i]; 
            System.out.print(arr[i]+",");
        }

        System.out.println("\nSum of all array elements is: "+temp);
        
    }
}