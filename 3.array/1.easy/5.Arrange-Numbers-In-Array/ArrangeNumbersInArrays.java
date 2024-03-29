// Arrange Numbers in Array

// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
// Note:
// You need not print the array. You only need to populate it.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains an integer 'N'.
// Output Format :
// For each test case, print the elements of the arra/listy separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^4

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 6
// Sample Output 1 :
// 1 3 5 6 4 2
// Sample Input 2 :
// 2
// 9
// Sample Output 2 :
// 1 3 5 7 9 8 6 4 2

// the sequence is like this - fist place will be 1 and last be 2 ,then first sec be 3 and last sec be 4 and so on

import java.util.Scanner;

public class ArrangeNumbersInArrays {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     int half;

    //     if(n % 2 == 0){
    //         half = n / 2 - 1;
    //     }else{
    //         half = n / 2;
    //     }

    //     for(int i = 0,j = 1; i <= half; i++,j += 2){
    //         arr[i] = j;
    //     }
    //     for(int i = n - 1,j = 2; i > half; i--,j += 2){
    //         arr[i] = j;
    //     }

    //     //For print
    //     for(int i = 0; i < n; i++){
    //         System.out.print(arr[i] + " ");
    //     }

    // }

    // OR

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        int j = n - 1;
        int count = 1;

        while(i <= j){
            arr[i] = count;
            count++;
            
            if(count <= n){
                arr[j] = count;
                count++;
            }
            
            i++;
            j--;
        }

        //For print
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }

    }
    
}
