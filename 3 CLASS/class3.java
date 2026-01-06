import java.util.*;

public class class3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a>18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not adult");
        // }

        // if(a%2==0){
        //     System.out.println("Even number");
        // }
        // else{
        //     System.out.println("odd");
        // }
        
        // if(a==b){
        //     System.out.println("Equal");
        // }
        // else if(a<b){
        //     System.out.println(a+ " is lesser then " + b);
        // }
        // else{
        //     System.out.println(a+ " is greater then " + b);
        // }
         switch(a){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("hello1");
            break;
            case 3 : System.out.println("hello2");
            break;
            default : System.out.println("invalid");

         }
        
    }
}