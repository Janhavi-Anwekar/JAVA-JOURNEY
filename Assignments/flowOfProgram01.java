
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
    }
}

