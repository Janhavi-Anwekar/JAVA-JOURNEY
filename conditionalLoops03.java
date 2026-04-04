import java.util.Scanner;

public class conditionalLoops03 {
    
    public static void main(String[] args) {
        
        // 23. Input a number and print all the factors of that number (use loops)
        int x = 64;
        for(int i=x; i>0; i--) {
            if(x % i == 0) {
                System.out.print(i+" ");
            }
        }

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

    }
}
