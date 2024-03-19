// String to Integer

// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
// Input format :
// Numeric string S (string, Eg. "1234")
// Output format :
// Corresponding integer N (int, Eg. 1234)
// Constraints :
// 0 <= |S| <= 9
// where |S| represents length of string S.
// Sample Input 1 :
// 1231
// Sample Output 1 :
// 1231
// Sample Input 2 :
// 12567
// Sample Output 2 :
// 12567

public class StringToInteger {
    public static void main(String[] args) {
        String str = "1231";
        int ans = stringToInteger(str);
        System.out.println(ans);
    }

    // public static int getIntegerFromAsciiValue(char c){

    //     int integer =(int) c;
    //     int ans = 0;

    //     for(int i = 0,j = 48; i <= 9; i++,j++){
    //         if(integer == j){
    //             ans = i;
    //             break;
    //         }
    //     }

    //     return ans;
    // }

    public static int stringToInteger(String str){
        if(str.length() <= 1){
            return str.charAt(0) - '0';
        }

        int ans = stringToInteger(str.substring(0,str.length() - 1));
        int temp = str.charAt(str.length() - 1) - '0';

        return ans * 10 + temp;

    }
    
}
