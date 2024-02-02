// Print    *
//         ***
//        *****
//         ***
//          *

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a odd number n");
        int n = sc.nextInt();
        while(n % 2 == 0){
            System.out.println("Please input a odd number n");
            n = sc.nextInt();
        }

        
        //1st Pattern
        System.out.println("1st Pattern :-");
        for(int i = 1; i <= n / 2 + 1; i++){
            for(int j = 1; j <= (n/2 + 1) - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 1; i <= n / 2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (n/2 * 2) - (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
