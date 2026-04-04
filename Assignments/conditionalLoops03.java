import java.util.*;

public class conditionalLoops03 {

    static Scanner sc = new Scanner(System.in);
    

    // 23. Input a number and print all the factors of that number (use loops)
    public static void printFactors(int a) {
        for(int i=a; i>0; i--) {
            if(a % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void printSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0 ){
            System.out.print("Enter n : ");
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("SUM : "+ sum);
    }


    // Intermediate Java Program

    //7. Power In Java
    public static void xPown(int x, int p) {
        int xRp = (int)Math.pow(x, p);
        System.out.println(xRp);
    }

    //8. Calculate Depreciation of Value
    // Depreciation per year= (Cost − Salvage Value​) / Useful Life

    // 9. Calculate Batting Average
    // Batting Average = Total Runs Scored / Number of Times Out
        
    // 10. Calculate CGPA Java Program
    // CGPA = ∑(Grade Points×Credits)​​ / ∑Credits

    //11. Compound Interest Java Program
    // get formula and calculate

    //15. Find Ncr & Npr
    // NCR = (n−r)!n!​ / r!
    // NPR = n! / (n−r)!

    //16. Reverse A String In Java
    public static void revStr(String s) {
        int len = s.length();
        String newS = "";
        while(len > 0) {
            newS += s.charAt(len-1);
            len--;
        }

        System.out.println(newS);
    }

    //17. Find if a number is palindrome or not
    public static boolean isPalindrome(int num) {

        
        if(num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }
        int revN = 0;
        while(num > revN){
            revN = revN*10 + (num%10);
            num = num/10;
        }

        if(revN == num || revN/10 == num){
            return true;
        }

        return false;
    } 

    //19. HCF Of Two Numbers Program
    public static int findHCF(int a, int b) {
    if (b == 0) {
        return a;
    }
    return findHCF(b, a % b);
}
    //20. LCM Of Two Numbers
    static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0; // Edge case: LCM of 0 is 0
        return Math.abs(a * b) / findHCF(a, b);
    }

    //22. Perfect Number In Java
    public static boolean perfectN(int n) {

        if(n <= 1) return false;
        int sum = 1;
        for(int i=2; i<Math.sqrt((int)n); i++) {
            if(n % i == 0) {
                sum += i;
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        return sum == n;
    }

    // 25. Kunal is allowed to go out with his friends only on the even days of a given month.
    //  Write a program to count the number of days he can go out in the month of August.
    public static int getDays(String m) {
        switch (m) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                return 31;
            default:
                break;
        }
        return 30;
    }

    public static int countDays(String month) {
        int days = getDays(month);
        return days/2;

    }
    
    //26. Write a program to print the sum of negative numbers, sum of positive even numbers and the 
    // sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

    public static void print(){

        System.out.print("Enter x : ");
        int n = sc.nextInt();
        int sumOfnegative = 0;
        int sumOfPositiveEven = 0;
        int sumOfPositiveOdd = 0;

        while(n != 0) {
            if(n < 0){
                sumOfnegative += n;
            } else {
                if(n % 2 == 0) {
                    sumOfPositiveEven += n;
                } else {
                    sumOfPositiveOdd += n;
                }
            }
            System.out.print("Enter x : ");
            n = sc.nextInt();
        }
        System.out.println("positive Even : " + sumOfPositiveEven);
        System.out.println("positive odd : "+sumOfPositiveOdd);
        System.out.println("negative : "+ sumOfnegative);
    }


    public static void main(String[] args) {
        
            
       

        

        

    }
}
