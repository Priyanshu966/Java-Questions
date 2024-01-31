// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1
import java.util.Scanner;

public class PrintPower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int power = 1;

        for(int i = 1; i <= n ; i++){
            power *= x;
        }

        System.out.println(power);

    }
    
}
