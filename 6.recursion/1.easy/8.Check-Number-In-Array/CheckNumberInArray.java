// Check Number in Array

// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// 'true' or 'false'
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 10
// 8
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 9 8 10
// 2
// Sample Output 2 :
// false

public class CheckNumberInArray {
    public static void main(String[] args) {
        int arr[] = {9,8,6};
        int n = 2;

        boolean ans = check(arr,n);
        System.out.println(ans);
        
    }

    public static boolean check(int arr[], int n){
        return check(arr,n,arr.length - 1);
    }

    public static boolean check(int arr[], int n , int i){
        if(i <= 0){
            return false;
        }

        if(arr[i] == n){
            return true;
        }

        return check(arr,n,i - 1);

    }
    
}
