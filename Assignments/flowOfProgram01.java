
import java.util.*;

public class flowOfProgram01 {
    
       public static void main(String[] args) {

        //1. Input a year and find whether it is a leap year or not.
        int year = 2008;

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its leap year");
        } else {
            System.out.println("Its not");
        }

        //2. Take two numbers and print the sum of both.
        int a = 5, b = 7;
        System.out.println(a+b);

        //3. Take a number as input and print the multiplication table for it.
        int n = 5;

        for(int i=1; i<=10; i++) {
            System.out.print(n*i+" ");
        }

    }
}

