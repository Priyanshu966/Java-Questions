public class FindMaximumElement{
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,2,9,3};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}