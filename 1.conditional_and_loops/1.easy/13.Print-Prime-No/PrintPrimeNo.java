// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

import java.util.Scanner;
public class PrintPrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }

        }

    }
    
}
