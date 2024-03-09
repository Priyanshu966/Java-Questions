
public class CheckSorted {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7,6};

        boolean ans = checkSorted(arr,0);
        System.out.println(ans);
        
    }

    public static boolean checkSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }

        if(arr[i + 1] < arr[i]){
            return false;
        }


        return checkSorted(arr,i + 1);
    }
    
}
