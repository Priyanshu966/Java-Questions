public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;

        // int ans = getFibonacci(0, 1,n);
        int ans = getFibonacci(n);
        System.out.println(ans);
        
    }

    // public static int getFibonacci(int i, int j, int n){
    //     if(n == 0){
    //         return n;
    //     }else if(n == 1){
    //         return j;
    //     }

    //     int ans = getFibonacci(j, i + j, n - 1);
    //     return ans;
    // }

    public static int getFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int ans = getFibonacci(n - 1) + getFibonacci(n - 2);
        return ans;
    }
    
}
