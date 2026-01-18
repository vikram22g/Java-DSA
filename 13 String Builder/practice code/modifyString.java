import java.util.*;

public class modifyString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String input=sc.nextLine();

        StringBuilder sb=new StringBuilder(input);

        // insert
        sb.insert(0,"learning ");

        // append
        sb.append(" is best");

        // printing
        System.out.println("Output: "+sb.toString());
    }
}