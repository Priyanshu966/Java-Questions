// array/list.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 50
// 0 <= N <= 10^2
// 0 <= X <= 10^9
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7 
// 12
// Sample Output 1:
// 5
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7 
// 19
// 9
// 2 -5 8 -6 0 5 10 11 -3
// 10
// Sample Output 2:
// 0
// 5


//  Explanation for Input 2:
// Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

// For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)


public class TripletSum {
    public static void main(String[] args) {

    int arr[]  = {2,-5,8,-6,0,5,10,11,-3};
    int sum = 10;
    int count = 0;

    for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            for(int k = j + 1; k < arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == sum){
                    count++;
                }

            }
        }
    }
    System.out.println(count);
        
    }

    
    
}
