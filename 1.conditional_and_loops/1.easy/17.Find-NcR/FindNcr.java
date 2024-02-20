// Ncr  =  n!                      n!/ {r!*(n - r)!}
//     r!.(n - r)!  in math                          in computer

import java.util.Scanner;

public class FindNcr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n");
        int n = sc.nextInt();
        System.out.println("Please input r");
        int r = sc.nextInt();

        int ans = factorial(n)/(factorial(r)*factorial(n - r));
        System.out.println(ans);


    }

    public static int factorial(int num){
        if(num == 0){
            return 0;
        }
        int product = 1;
        for(int i = 2; i <= num; i++){
            product *= i;
        }
        return product;
    }
    
}
