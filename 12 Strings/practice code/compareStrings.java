import java.util.*;

public class compareStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st name: ");
        String name1=sc.nextLine();
        System.out.print("Enter 2nd name: ");
        String name2=sc.nextLine();

        // strings ko compare karne ke liye hum compareTo() ka use karenge
        // ye hume 3 result deta hai
        // 1. s1 > s2 : any positive value  (2,4 53, 4)
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : any negetive value (-2,-44, -1)

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are same.");

        }
        else{
            System.out.println("Strings are not same.");
        }
    }
}