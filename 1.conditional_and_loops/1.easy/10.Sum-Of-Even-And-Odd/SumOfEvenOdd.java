// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
// Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
// Input format :
//  Integer N
// Output format :
// Sum_of_Even_Digits Sum_of_Odd_Digits
// (Print first even sum and then odd sum separated by space)

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int currentDigit;
        int remDigit;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        do{
            currentDigit = n % 10;
            remDigit = n / 10;
            if(currentDigit % 2 == 0){
                sumOfEven += currentDigit;
            }else{
                sumOfOdd += currentDigit;
            }
            n = remDigit;

        }while(remDigit > 0);

        System.out.println("Sum of even digits is : " + sumOfEven);
        System.out.println("Sum of odd digits is : " + sumOfOdd);

    }
    
}
