// print   1111   and   1234   and  4321   and   4444   and   ****
//         2222         1234        4321         4444         ****
//         3333         1234        4321         4444         ****
//         4444         1234        4321         4444         ****              here n = 4;
 



import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1st Pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


         //2nd Pattern
         for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j);

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //3rd Pattern
         for(int i = 1; i <= n; i++){
            for(int j = n; j > 0; j--){
                System.out.print(j);

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //4th Pattern
         for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(n);

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //5th Pattern
         for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
}
