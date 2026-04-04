import java.util.Scanner;

public class conditionalLoops03 {
    
    public static void main(String[] args) {
        
        // 23. Input a number and print all the factors of that number (use loops)
        int a = 64;
        for(int i=a; i>0; i--) {
            if(a % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
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

        // Intermediate Java Program

        //7. Power In Java
        int x= 5;  //base
        int p = 3;   // power

        int xRp = (int)Math.pow(x, p);
        System.out.println(xRp);

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
        String s = "video";
        int len = s.length();
        String newS = "";
        while(len > 0) {
            newS += s.charAt(len-1);
            len--;
        }

        System.out.println(newS);


    }
}
