// Print       1        and     *      and    1
//            121              ***           232
//           12321            *****         34543
//          1234321          *******       4567654


import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1st Pattern
        System.out.println("1st Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1, k = i - 1; j < i ;k--,j++){
                System.out.print(k);
            }
            System.out.println("");
        } 

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //2nd Pattern
        System.out.println("2nd Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        } 

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //2nd Pattern
        System.out.println("2nd Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1,k = i; j <= i; j++,k++){
                System.out.print(k);
            }
            for(int j = 1,k = 2 * i - 2; j < i ; j++,k--){
                System.out.print(k);
            }
            System.out.println("");
        } 

        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
}
