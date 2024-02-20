public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,7,9};
        int num = 7;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                System.out.println(i);
                break;
            }
        }
        
    }
    
}
