
// Write a program to print multiplication table of n
// Input Format :
// A single integer, n
// Output Format :
// First 10 multiples of n each printed in new line

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Table of "+ n + " is-");
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }

    }
    
}
