// Print *****
//        *****
//         *****
//          *****
//           *****      here n = 5

import java.util.Scanner;

public class Parallelogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
