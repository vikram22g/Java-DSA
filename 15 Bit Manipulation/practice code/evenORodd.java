import java.util.*;

public class evenORodd{
    public static int EvenOdd(int n){
        int pos= 0;
        int bitmask= 1<<0;
        int ans= bitmask & n;
        if(ans == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        int value= EvenOdd(num);
        switch(value){
            case 0: System.out.println("number is even.");
            break;
            case 1: System.out.println("number is odd.");
            break;
            default: System.out.println("error!!");
        }
    }
}