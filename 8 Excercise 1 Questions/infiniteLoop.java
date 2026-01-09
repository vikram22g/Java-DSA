// 6. Write an infinite loop using do while condition.

import java.util.*;

public class infiniteLoop{
    public static void main(String[] args){
            int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i>=1); // it will count infinitely without stop.
    }
}