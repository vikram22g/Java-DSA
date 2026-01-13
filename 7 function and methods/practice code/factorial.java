import java.util.*;

public class factorial{
    public static int calculateFactorial(int a){
        int temp=1; 
        for(int i=1; i<=a; i++){
            temp=temp*i;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int fact=calculateFactorial(num);
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}