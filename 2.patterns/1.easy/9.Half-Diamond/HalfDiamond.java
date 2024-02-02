// Print *
//       *1*
//       *121*
//       *12321*
//       *1234321*
//       *123454321*
//       *1234321*
//       *12321*
//       *121*
//       *1*
//       *                here n = 5


import java.util.Scanner;
public class HalfDiamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number n");
        int n = sc.nextInt();

        //First half
        for(int i = 1; i <= n + 1; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    System.out.print("*");
                }else{
                    System.out.print(j - 1);
                }
            }
            for(int j = 1,k = i - 2; j < i; j++,k--){
                if(j == i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(k);
                }

            }
            System.out.println("");
        }

        //Second half
        
    }
}
