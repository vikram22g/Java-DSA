import java.util.Scanner;

public class sum{
    public static void main(String[] argh){
        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int b = sc.nextInt();

        int sum = (a+b);

        System.out.println("Your sum is: " + sum);
    }
}