// Given a binary number as an integer N, convert it into decimal and print
// 1100 => 12



public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1100;
        int temp = n;
        int ans = 0;
        int pow = 1;

        while(temp > 0){
            int lastDigit = temp % 10;
            temp = temp / 10;
            ans = ans +  (pow * lastDigit);
            pow *= 2;
        }
        System.out.println(ans);
    }
 
    
}
