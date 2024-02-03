// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)


import java.util.Scanner;

public class SumOrProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();
        System.out.println("Please input 1 for sum and 2 for product(Up to n natural no)");
        int c = sc.nextInt();

        while(c != 1 && c != 2){
            System.out.println(-1);
            System.out.println("Wrong input , Please input again");
            c = sc.nextInt();
        }

        if(c == 1){
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("Total sum is :- " + sum);
        }else{
            int product = 1;
            for(int i = 2; i <= n; i++){
                product *= i;
            }
            System.out.println("Total product is :- " + product);
        }
    }
    
}
