// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class findGreaterNumber{
    public static void WhichIsGreater(int a,int b){
        if(a<b){
            System.out.println(b+" is Greater then "+a);
        }
        else{
            System.out.println(a+" is Greater then "+b);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();

        WhichIsGreater(num1,num2);
    }
}