// Write a program to print all the factors of a number other than 1 and the number itself.

import java.util.Scanner;

public class PrintFactors {
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();

       for(int i = 2; i < n; i++){
        if(n % i == 0){
            System.out.print(i + " ");
        }
       }


    }
    
}
