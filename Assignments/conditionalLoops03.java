import java.util.Scanner;

public class conditionalLoops03 {

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
        return Math.abs(a * b) / findGCD(a, b);
    }
    
    public static void main(String[] args) {
        
            
       
        

        

    }
}
