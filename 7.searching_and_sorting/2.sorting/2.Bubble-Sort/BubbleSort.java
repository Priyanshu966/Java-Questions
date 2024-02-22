import java.util.Scanner;

public class BubbleSort {
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

        //Sorting algorithm(Bubble Sort)
        //For ascending order
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        //For printing the sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
    }
    

