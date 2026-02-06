import java.util.*;

public class SumOfNatural{
    public static void sumOfNatural(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i; 
        sumOfNatural(i+1, n, sum);

    }
    public static void main(String args[]){
        int n=5;
        int i=1;
        int sum=0;
        sumOfNatural(i,n,sum); // call function
    }
}