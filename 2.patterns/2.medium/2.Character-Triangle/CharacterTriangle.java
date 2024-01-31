// Print  A    and   A    and   D
//        BB         BC         CD
//        CCC        CDE        BCD
//        DDDD       DEFG       ABCD

import java.util.Scanner;

public class CharacterTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();

        //1st Pattern
        System.out.println("1st Pattern :-");
        for(int i = 0; i < n; i++){
            char c = (char)('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(c);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


         //2nd Pattern
        System.out.println("2nd Pattern :-");
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                char c = (char)('A' + i + j);
                System.out.print(c);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


         //3rd Pattern
        System.out.println("3rd Pattern :-");
        for(int i = n; i > 0; i--){
            for(int j = 0; j <= n - i ; j++){
                char c = (char)('A' + i - 1 + j);
                System.out.print(c);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");



    }
}