import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // boolean isPrime = true;

        if(n == 0){
            System.out.println(n + " is neither Prime nor Composite no");
            return;
        }

        for(int i = 2; i < n; i++){
            if(n % 2 == 0){
                // isPrime = false;
                System.out.println(n + " is a Composite no");
                return;
            }
        }
        System.out.println(n + " is a Prime no");



        // if(isPrime){
        //     System.out.println(n + " is a Prime no");
        // }else{
        //     System.out.println(n + " is a Composite no");
        // }
    }
    
}
