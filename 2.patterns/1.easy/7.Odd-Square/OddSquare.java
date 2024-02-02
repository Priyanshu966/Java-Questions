// Print 13579
//       35791
//       57913
//       79135
//       91357


import java.util.Scanner;

public class OddSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1,k = (2 * i - 1); j <= n - i + 1; j++,k += 2){
                System.out.print(k);
            }
            for(int j = 1; j <= i - 1; j++){
                System.out.print(2 * j - 1);
            }
            System.out.println("");
        }


    }
}
