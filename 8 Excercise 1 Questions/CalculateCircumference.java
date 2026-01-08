// 4. Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class CalculateCircumference{
    public static double CalcCircum(double r){
        double circum=2*3.14159*r;
        return circum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your radius: ");
        double num=sc.nextInt();

        double answer=CalcCircum(num);
        System.out.println("The Circumference is: "+ answer);
    }
}