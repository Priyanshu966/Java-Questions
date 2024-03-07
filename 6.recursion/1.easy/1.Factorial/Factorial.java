public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n ){
        if(n == 1 || n == 0){
            return n;
        }

        return n * factorial(n - 1);
    }
    
}
