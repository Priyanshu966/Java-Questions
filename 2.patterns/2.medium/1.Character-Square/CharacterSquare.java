// Print  ABCD  and  ABCD
//        ABCD       BCDE
//        ABCD       CDEF
//        ABCD       DEFG

import java.util.Scanner;

public class CharacterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();

        //1st Pattern
        System.out.println("1st Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                char c = (char)('A' - 1 + j);
                System.out.print(c);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


         //2nd Pattern
        System.out.println("2nd Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                char c = (char)('A' + i - 1 + j - 1);
                System.out.print(c);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
    
}
