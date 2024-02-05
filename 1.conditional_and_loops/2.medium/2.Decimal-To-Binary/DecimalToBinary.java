public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 12;
        int temp = decimal;
        int ans = 0;
        int decimalPlace = 1;

        while(temp >= 1){
            int remainder = temp % 2;
            temp /= 2;
            ans += (remainder * decimalPlace);
            decimalPlace *= 10;

        }
        System.out.println(ans);
    }
    
}
