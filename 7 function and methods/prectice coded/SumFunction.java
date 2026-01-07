import java.util.*;

public class SumFunction{
    public static int SumOfNumbers(int a, int b){
        int sum = a+b;
        return sum; //return sum
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //taking input
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum= SumOfNumbers(num1,num2);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
    }
}