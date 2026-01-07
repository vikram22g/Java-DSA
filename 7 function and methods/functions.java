import java.util.*;

public class functions{
    //creating function that print my name
    public static void PrintMyName(String name){
        System.out.println("Hello "+name);
        return;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();

        PrintMyName(name);// calling function
    }
}