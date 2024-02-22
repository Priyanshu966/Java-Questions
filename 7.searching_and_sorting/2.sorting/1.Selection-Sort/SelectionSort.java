import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //For taking input array
        System.out.println("Please input size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Now input the elements of the array");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Sorting algorithm(Selection Sort)
        //For ascending order
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;

        }


        //For printing the sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
    
}
