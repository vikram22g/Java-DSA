// Additional Notes From Apna collage:- https://docs.google.com/document/d/1upllrlSyv1pe86hBbNPUFT1nrmWsr6QPM4joL6Br1gU/edit?tab=t.0

// to print anything in java we use:- System.out.println("hello")
import java.util.Scanner;

public class class2{
    public static void main(String[] args){

        // Print
        System.out.println("hello java! this is my first program in java"); 
        
        System.out.println("*");
        System.out.print("**\n");
        System.out.print("***\n****\n");

        // Variables
        // java is a typed language we have to declare variables types while declareing
        // Types 
            /* 1.Primitive
                byte
                short
                char
                boolean
                int
                long
                float
                double */
            /* 2.Non-Primitive
                string
                Array
                class
                object
                interface */
            
        String name = "vikram mehra";
        int num1 = 33;
        int num2 = 32;
        
        System.out.println(num2);
        System.out.println(num1);
        System.out.println(name);


        // Input
        // To take input from user we have to import scanner
            // Import java.util.Scanner;    at the top of this program

          /*  int = nextInt()
              float = nextFloat()
              double = nextDouble()
              Strint(word) = next()
              String(Line) = nextLine() */
              
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:-");
        String myname = sc.nextLine();

        System.out.println("Enter your Age:-");
        int age = sc.nextInt();

        System.out.println("Your Name is: " + myname);
        System.out.println("Your age is: " + age);

    }
}