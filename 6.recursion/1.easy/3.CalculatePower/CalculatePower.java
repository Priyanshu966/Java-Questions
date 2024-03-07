public class CalculatePower {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        int ans = power(a, b);
        System.out.println(ans);
    }

    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }

        int product = a * power(a,b - 1);
        return product;
    }
    
}
