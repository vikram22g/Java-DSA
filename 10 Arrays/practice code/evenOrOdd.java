// count the even or odd numbers

import java.util.*;

public class evenOrOdd{
    public static void main(String args[]){
        int arr[]={3,5,4,3,2,6};
        int even=0;
        int odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){ //if this condition will true then even added by one
                even=even+1;
            }
            else if(arr[i]%2!=0){ // if this condition will true then odd added by one
                odd=odd+1;
            }
        }
        System.out.println("even numbers: "+even+"\nodd numbers: "+odd);
    }
}