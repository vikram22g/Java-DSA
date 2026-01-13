// Find the largest element in array

import java.util.*;

public class LargestElement{
    public static void main(String args[]){
        int arr[]={10,35,4,22};
        int temp=0;
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(temp<arr[i]){
                temp=arr[i];
                index=i;
            }
        }
        System.out.println("The gratest element of array is: "+temp+" at the index of: "+index);

    }
}