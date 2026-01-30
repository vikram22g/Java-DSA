import java.util.*;

public class SwapWithoutThirdVariable{
    public static void main(String args[]){
        int a=1;
        int b=2;
        System.out.println("Before swaping: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("After swaping: "+a+" "+b);
    }
}