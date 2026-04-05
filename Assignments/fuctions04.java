import java.util.*;

public class fuctions04 {

    //7. Define a method to find out if a number is prime or not.
    public static boolean isPrime(int n) {

        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            } 
        }

        return true;
    }
    
    //10. Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static boolean isPalindrome(int n) {

        if(n < 0 || n % 10 == 0 && n != 0){
            return false;
        }

        int revN = 0;
        while(n > revN) {
            revN = revN*10 + (n%10);
            n = n/10;
        }

        if(revN == n || revN/10 == n) {
            return true;
        }

        return false;
    }

    //13. Write a function that returns all prime numbers between two given numbers.
    public static void printPrime(int a, int b){

        for(int i=a; i<=b; i++){

            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {

        printPrime(3, 15);

    }
}
