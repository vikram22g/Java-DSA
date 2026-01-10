// 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;

public class GCD{
    public static void main(String[] args){
        int a=18;
        int b=81;
        int r=0;
        do{ // GCD finder using do while loop
            if(a>b){
                r=a%b;
                a=b;
                b=r;
            }
            else{
                r=b%a;
                b=a;
                a=r;

            }
        }while(r==0);
        System.out.println(r);
    }
}