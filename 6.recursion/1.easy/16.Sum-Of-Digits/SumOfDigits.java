// Sum of digits (recursive)

// Write a recursive function that returns the sum of the digits of a given integer.
// Input format :
// Integer N
// Output format :
// Sum of digits of N
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 12345
// Sample Output 1 :
// 15
// Sample Input 2 :
// 9
// Sample Output 2 :
// 9

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int ans = sumOfDigits(n);
        System.out.println(ans);
        
    }

    public static int sumOfDigits(int n){
        if(n < 10){
            return n;
        }

        return  (n % 10) + sumOfDigits(n/10); 
    }
    
}
