public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        int n = 5;

        int ans = sum(n);
        System.out.println(ans);
    }

    public static int sum(int n){
        if(n == 1 || n == 0){
            return n;
        }

        int sum = n + sum(n - 1);
        return sum;
    }
    
}
