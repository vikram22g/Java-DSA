import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("please enter you operator: ");
        char op = sc.next().charAt(0);

        if(op =='+'){
            System.out.println("Sum is: " + (num1+num2));
        }
        else if(op =='*'){
            System.out.println("Sum is: " + (num1*num2));
        }
        else if(op =='/'){
            System.out.println("Sum is: " + (num1/num2));
        }
        else if(op =='-'){
            if(num1>num2){

            System.out.println("Sum is: " + (num1-num2));
            }
            else{
            System.out.println("Sum is: " + (num2-num1));

            }
        }
        else{
            System.out.println("Please Enter valid input!!!");
        }

    }
}