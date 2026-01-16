// Strings are immutable

import java.util.*;

public class strings{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your firstname: ");
        String firstname=sc.nextLine();
        System.out.print("Enter your lastname: ");
        String lastname=sc.nextLine();


        // Operations On Strings

        // 1. Concatenation
        String fullname=firstname+" "+lastname;
        System.out.println("Hello "+fullname);

        //2. Length

        System.out.println("length of fullname is: "+fullname.length());

        //3. charAt

        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        // 4. compareTo() <== it is in practice code folder
        
        // 5. substring

        String sentence= "iron Man";
        String name= sentence.substring(5);
        System.out.println(name);
    }
}