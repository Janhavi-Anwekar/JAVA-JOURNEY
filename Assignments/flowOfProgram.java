
import java.util.Scanner;

public class flowOfProgram {
    
       public static void main(String[] args) {
        

        //1. Input a year and find whether it is a leap year or not.

        int year = 2007;

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its leap year");
        } else {
            System.out.println("Its not");
        }
    }
}

