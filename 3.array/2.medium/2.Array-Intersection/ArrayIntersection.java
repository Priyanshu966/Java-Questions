// Array Intersection

// You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in the order they appear in the first array/list(ARR1)


// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements of the first the array/list.

// Third line contains an integer 'M' representing the size of the second array/list.

// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// For each test case, print the intersection elements in a row, separated by a single space.

// Sample Input 2 :
// 1
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 2 1 2

public class ArrayIntersection {
    // public static void main(String[] args) {

    //     int arr1[] = {2,6,8,5,4,2,2};
    //     int arr2[] = {3,2,4,9,2};
    //     int length = 0;
    //     int ansArr[] = new int[length];

    //     for(int i = 0; i < arr1.length; i++){
    //         int currentElm = arr1[i];
    //         int repeat = 0;
    //         for(int j = 0; j < ansArr.length; j++){
    //             if(currentElm == ansArr[j]){
    //                 repeat++;
    //             }
    //         }
    //         for(int j = 0; j < arr2.length; j++){
    //             if(arr2[j] == currentElm && repeat == 0){
    //                 int temp[] = ansArr;
    //                 length++;
    //                 ansArr = new int[length];
    //                 for(int k = 0; k < ansArr.length - 1; k++){
    //                     ansArr[k] = temp[k];
    //                 }
    //                 ansArr[length - 1] = arr2[j];
    //                 break;
    //             }else if(arr2[j] == currentElm && repeat != 0){
    //                 repeat--;
    //             }
    //         }
    //     }

    //     for(int i = 0; i < ansArr.length; i++){
    //         System.out.print(ansArr[i] + " ");
    //     }
        
      
    // }

    //  OR


    public static void main(String[] args) {
        int arr1[] = {2,6,8,5,4,2,2};
        int arr2[] = {3,2,4,9,2};

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                }
            }
        }
    }
    
}
