import java.util.*;

public class sumOfOddNumbers{
    public static int calcSum(int a){//function to calculate sum of all odd numbers from 1 to n.
        int temp=0;
        for(int i=1; i<=a; i++){ 
            if(i%2!=0){ //if we devide number with 2 if remainder is not 0 it means that number is Odd.
                temp=temp+i;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();//input

        int sum=calcSum(num);
        System.out.println("Sum of odd numbers from 1 to "+num+" is: "+sum);
    }
}
