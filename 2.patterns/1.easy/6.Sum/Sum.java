// Print  1=1
//        1+2=3
//        1+2+3=6
//        1+2+3+4=10
//        1+2+3+4+5=15  here n = 5


import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int rowSum = 0;
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                rowSum += j;
                if(j != i){
                    System.out.print("+");
                }else{
                    System.out.print("=");
                    System.out.print(rowSum);
                }

            }
            System.out.println("");
        }

        


    }
    
}
