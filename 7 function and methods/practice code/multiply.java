import java.util.*;

public class multiply{
    public static int calculateProduct(int a, int b){
        int multiply= a*b;
        return multiply;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int multiply= calculateProduct(num1,num2);
        System.out.println(multiply);
    }
}