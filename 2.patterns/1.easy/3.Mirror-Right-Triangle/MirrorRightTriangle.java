// Print   ****   and    *   and    1    and    ****    and    4444
//          ***         **         12           ***            333
//           **        ***        123           **             22
//            *       ****       1234           *              1
 
import java.util.Scanner;

public class MirrorRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1st Pattern
        System.out.println("1st Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
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
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //3rd Pattern
        System.out.println("3rd Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


         //4th Pattern
        System.out.println("4th Pattern :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //5th Pattern
        System.out.println("5th Pattern :-");
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");




    }
    
}
