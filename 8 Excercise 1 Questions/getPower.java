//  Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
public class getPower{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b=sc.nextInt();
        int temp=1;
        for(int i=1;i<=b;i++){
            temp=temp*a;
        }
        System.out.println(temp);
    }
}