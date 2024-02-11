public class SumOfAllElement {
    public static void main(String[] args) {
        int arr[] = {2,5,1,2};
        int sum = 0;

        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Total sum is : " + sum);
    }
    
}
