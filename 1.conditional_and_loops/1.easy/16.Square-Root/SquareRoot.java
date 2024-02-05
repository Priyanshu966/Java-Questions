import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans = 1;
        boolean toTakePair = true;

        while(temp > 1){
            temp = temp / 2;
            if(toTakePair){
                ans *= 2; 
                toTakePair = !toTakePair;
            }else{
                toTakePair = !toTakePair;
            }
        }
        System.out.println(ans);
    }
    
}
