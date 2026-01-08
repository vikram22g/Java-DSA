import java.util.*;

public class FindVoter{
    public static void VoterFinder(int a){
        if(a>=18){
            System.out.println("You can vote");
            System.out.println("Because you are "+a+" years old");
        }
        else{
            System.out.println("You can't vote");
            System.out.println("Because you are Less then 18.");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        VoterFinder(age);
    }
}