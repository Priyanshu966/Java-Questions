public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = 9;

        int i = 0; 
        int j = arr.length;

        

        while(i < j){
            int mid = (i + j)/ 2;
            if(n == arr[mid]){
                System.out.println(mid);
                break;
            }else if(n < arr[mid]){
                j = mid - 1;
            }else if(n > arr[mid]){
                i = mid + 1;
            }

           


            
        }


    }
    
}
