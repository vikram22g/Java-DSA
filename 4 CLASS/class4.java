import java.util.Scanner;

public class class4{
    public static void main(String[] args){
        // for(int i=0; i<11; i++){
        //     System.out.println(i);
        // }
        Scanner sc= new Scanner(System.in);
        // while(i<11){
        //     System.out.println(i);
        //     i=i+1;
        // }

            char i;
        do{
            System.out.println("hi");
            i=sc.next().charAt(0);
        }while(i=='y');
    }
}