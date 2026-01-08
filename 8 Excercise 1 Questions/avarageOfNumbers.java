//  Enter 3 numbers from the user & make a function to print their average.
import java.util.*;

public class avarageOfNumbers{
    public static int calculateAvarage(int a, int b, int c){
        int avg= (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3=sc.nextInt();

        int getavarage=calculateAvarage(num1,num2,num3);
        System.out.println("The Avarage of "+num1+", "+num2+", "+num3+" is: "+getavarage);
    }
}