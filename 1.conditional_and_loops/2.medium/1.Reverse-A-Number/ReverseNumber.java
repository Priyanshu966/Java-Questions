// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reversedNo = 0;


        while(temp > 0){
            int lastDigit = temp % 10;
            temp = temp / 10;
            reversedNo = reversedNo * 10 + lastDigit;
        }
        System.out.println("Reversed no is :- " + reversedNo);
        
    }
    
}
 