import java.util.*;
public class tableUsingRecursion{
    public static void table(int n, int a){
        if(a==11){
            return ;
        }
        System.out.println(n*a);
        table(n, a+1);
    }
    public static void main(String args[]){
        int n=2;
        table(n,1);
    }
}