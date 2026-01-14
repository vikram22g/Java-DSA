import java.util.*;

public class reverseArray{
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            // reversing the array
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        // printing the reversed array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}