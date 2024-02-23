import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedString = reverseString(str);
        System.out.println(reversedString);

    }

    public static String  reverseString(String str){
        String reversedString = "";

        for(int i = 0; i < str.length(); i++){
            reversedString = str.charAt(i) + reversedString;
        }
        return reversedString;

    }
    
}
