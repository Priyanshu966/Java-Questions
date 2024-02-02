// Print  *    and  1   and  1   and 1   and  1   and 1
//        **        22       21      12       23      23
//        ***       333      321     123      345     456
//        ****      4444     4321    1234     4567    78910    here n = 4;
  
import java.util.Scanner;

public class RightTriangle {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();
        
        //Pattern 1
        System.out.println("Pattern 1 is :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Pattern 2
        System.out.println("Pattern 2 is :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Pattern 3
        System.out.println("Pattern 3 is :-");
        for(int i = 1; i <= n; i++){
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Pattern 4
        System.out.println("Pattern 4 is :-");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Pattern 5
        System.out.println("Pattern 5 is :-");
        for(int i = 1; i <= n; i++){
            int currentRow = i;
            for(int j = 1; j <= i; j++){
                System.out.print(currentRow);
                currentRow++;
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Pattern 6
        System.out.println("Pattern 6 is :-");
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
