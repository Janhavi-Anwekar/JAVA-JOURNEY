public class firstJava02 {


    // 7. To calculate Fibonacci Series up to n numbers.
    public static void fibo(int a, int b, int count, int n) {

        if(count == n) {
            return;
        }

        System.out.print(a+" ");
        
        fibo(b, a+b, count+1, n);
    }

        // 8. To find out whether the given String is Palindrome or not.
    public static boolean isPalindrome(String s){
        int len = s.length();
        int end = len-1;
        int start = 0;

        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++; 
            end--;
        }

        return true;
    }
    
        //9. To find Armstrong Number between two given number.
        public static boolean isArmstrong(int n) {
            int x = n;
            int sum = 0;
            int digits = (n == 0) ? 1 : (int) Math.log10(n) + 1;


            while(n != 0){
                int digit = n%10;
                sum += (int)Math.pow(digit, digits);
                n = n/10;
            }

            if(sum == x) {
                return true;
            }

            return false;
        }



    public static void main(String[] args) {
        
        // 7. To calculate Fibonacci Series up to n numbers.
        int n = 7;
        fibo(0, 1, 0, n);
        System.out.println();

        // 8. To find out whether the given String is Palindrome or not.
        String s = "night";

        boolean isPalindrome = isPalindrome(s);
         if(isPalindrome){
            System.out.println("Its palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //9. To find Armstrong Number between two given number.
        int start = 150;
        int end = 250;

        for(int i=start; i<=end; i++) {
            if(isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
        
       
        
    }
}
