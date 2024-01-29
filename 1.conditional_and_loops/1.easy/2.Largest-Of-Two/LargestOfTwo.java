import java.util.*;

public class LargestOfTwo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b){
            System.out.println("a is greater than b");
        }else if(a < b){
            System.out.println("b is greater than a");
        }else{
            System.out.println("Both are equal");
        }

    }
    
}
