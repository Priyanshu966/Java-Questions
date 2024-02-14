// Swap Alternate

// You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
// You don't need to print or return anything, just change in the input array itself.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the elements of the resulting array in a single row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1sec
// Sample Input 1:
// 1
// 6
// 9 3 6 12 4 32
// Sample Output 1 :
// 3 9 12 6 32 4

public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = {3,4,1,9,6,5,7};

        int j = 0;
        while(j < arr.length - 1){
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            
            j += 2;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
