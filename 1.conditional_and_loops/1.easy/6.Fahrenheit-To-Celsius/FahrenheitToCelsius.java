import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);

      double f = s.nextDouble();
      double c = (f - 32) * 5/9;

      System.out.println(f + " in celsius is: " + c);

    }
    
}
