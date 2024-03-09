// First Index of Number

// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1First Index of Number

// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1

public class FirstIndexOfNumber {
    public static void main(String[] args) {
        int arr[] = {4,2,7,3,9,7,6,3};
        int n = 3;

        int ans = findIndex(arr,n);
        System.out.println(ans);
        
    }

    public static int findIndex(int arr[], int n){
        return findIndex(arr,n,0);
    }

    public static int findIndex(int arr[], int n, int i){
        if(i >= arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }

        return findIndex(arr,n,i + 1);
    }
    

}
