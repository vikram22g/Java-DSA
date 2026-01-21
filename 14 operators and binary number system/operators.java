public class operators{
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // Airthmetic Operators
        // Binary
        System.out.println("Airthmetic Operators Binary:");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Unary "++"
        System.out.println("Airthmetic Operators Unary:");
        System.out.println(++a); // a contain 10 preincrement output is 11
        System.out.println(a++); // post increment means do the current task and then increase a by 1 output will be 11
        // now if we print the value of a again it will be 12 because we increased it
        System.out.println(a);

        // Unary "--"
        System.out.println(--a); // --a means decrease the value of a by one first and then do the current task output will be 11
        System.out.println(a--); // a-- means do current task first then decrease the value of a by one output will be 11 
        // if we print the value of a again then it will be 10 because it decreased by one 
        System.out.println(a); // output will be 10

        // Relational Operators:
        System.out.println("Relational Operators:");
        if(a==b){
            System.out.println("True");
            }
        else{
            System.out.println("Fasle");
        }

        if(a!=b){
            System.out.println("not equal");

        }
        else{
            System.out.println("equal");

        }

        if(a<b){
            System.out.println("a is greater");
        }
        else if (a>b){
            System.out.println("b is greater");
        }

        for(int i=0; i<=2; i++){
            System.out.println(i);
        }
        for(int i=2; i>=0; i--){
            System.out.println(i);
        }



        // Logical Operators 
        System.out.println("Logical Operators:");

        if(a>9 && a<18){ // if both condition are true then the whole codition is true and print "you are in school" otherwise it will be false
            System.out.println("You are is school");
        }
        

        if(b>a || b==a){ // if any one condition is true then it will be true 
            System.out.println("i think b is greater or equal to a");
        }

        if(a!=b){
            System.out.println("true");
        }


        // Assignment Operator 

        System.out.println("Assignemetn Operators: ");

        a=b; // a contais 10 and b has 20 in this operation a=b means a=20;
        System.out.println(a);

        a+=2; // it means a=a+2
        System.out.println(a);

        a-=2; // it means a=a-2
        System.out.println(a);

        a*=2; // it means a=a*2
        System.out.println(a);

        a/=2; // a=a/2
        System.out.println(a);
        

    
    }
}