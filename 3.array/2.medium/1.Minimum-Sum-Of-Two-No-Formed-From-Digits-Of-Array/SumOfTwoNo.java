// Given an array of digits (values are from 0 to 9), the task is to find the minimum possible sum of two numbers formed from digits of the array.Please note that all digits of the given array must be used to form the two numbers.


public class SumOfTwoNo {
    public static void main(String[] args){

        int arr[] ={5, 3, 0, 7, 4};

        
        //First smallest array
        int arr1[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        //Second smallest array
        int arr2[] = new int[arr.length];

        int digit1Index = arr.length - 1;
        int digit2Index = arr.length - 2;

        int digit1 = arr1[arr1.length - 1];
        int digit2 = arr1[arr1.length - 2];

        if(digit1 != digit2){
            int temp = arr[digit1Index];
            arr[digit1Index] = arr[digit2Index];
            arr[digit2Index] = temp;
        }else{
            while(arr[digit1Index] == arr[digit2Index]){
                if(digit1Index == 0 || digit2Index == 0){
                    break;
                }
                digit1Index--;
                digit2Index--;
            }
            int temp = arr[digit1Index];
            arr[digit1Index] = arr[digit2Index];
            arr[digit2Index] = temp;
        
        }

        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }


        //Creating Sum Array
        int sumArr[] = new int[arr.length];
        int remainNo = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            int digitSum = arr1[i] + arr2[i] + remainNo;
            int remainder = digitSum % 10;
            sumArr[i] = remainder;
             
            remainNo = digitSum / 10;
        }


        

        //For printing the ans(sumArr)
        System.out.println("Output will be :-");
        for(int i = 0; i < sumArr.length; i++){
            System.out.print(sumArr[i]);
        }



        

    }
    
}
