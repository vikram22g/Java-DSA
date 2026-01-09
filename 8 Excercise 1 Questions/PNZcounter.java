// 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;

public class PNZcounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        char a;
        do{
            System.out.print("Enter number: ");
            int number=sc.nextInt();
            if(number<0){
                neg=neg+1;
            }
            else if(number>0){
                pos=pos+1;
            }
            else if(number==0){
                zero=zero+1;
            }

            System.out.print("Do you add more numbers(y/n): ");
            a=sc.next().charAt(0);

        }while(a=='y');
        
        System.out.println("positive numbers: "+pos+"\nnegetive numbers: "+neg+"\nzeros: "+zero);
    }
}