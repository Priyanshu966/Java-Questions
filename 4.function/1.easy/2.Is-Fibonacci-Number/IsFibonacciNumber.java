// Fibonacci Number

// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
//     F(n) = F(n-1) + F(n-2)
// where F(0) = 0 and F(1) = 1



import java.util.Scanner;

public class IsFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isFibonacciNumber(n);
        System.out.println(check);

    }

    public static boolean isFibonacciNumber(int n){
        if(n == 0 || n == 1){
            return true;
        }
        int firstElm = 0;
        int secElm = 1;

        while(secElm < n){
            int temp = firstElm;
            firstElm = secElm;
            secElm = temp + secElm;

            if(n == secElm){
                return true;
            }

            
        }


        return false;
    }
    
}
