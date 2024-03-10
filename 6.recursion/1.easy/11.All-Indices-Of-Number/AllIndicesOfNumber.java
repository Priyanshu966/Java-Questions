// All Indices of Number

// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// indexes where x is present in the array (separated by space)
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 5
// 9 8 10 8 8
// 8
// Sample Output :
// 1 3 4

public class AllIndicesOfNumber {
    public static void main(String[] args) {

        int arr[] = {9,8,10,8,8};
        int n = 8;

        int ans[] = findAllIndex(arr, n);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        
    }

    public static int[] findAllIndex(int arr[], int n){
        int temp[] = new int[0];
        return findAllIndex(arr, n, 0, temp);
    }

    public static int[] findAllIndex(int arr[], int n, int i, int ans[]){
        if(i == arr.length){
            return ans;
        }
        if(arr[i] == n){
            int temp[] = ans;
            ans = new int[temp.length + 1];
            for(int j = 0; j < temp.length; j++){
                ans[j] = temp[j];
            }
            ans[temp.length] = i;
        }

        return findAllIndex(arr, n, i + 1,ans);
    }
    
}
