// Check Palindrome (recursive)

// Check whether a given String S is a palindrome using recursion. Return true or false.
// Input Format :
// String S
// Output Format :
// 'true' or 'false'
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// racecar
// Sample Output 1:
// true
// Sample Input 2 :
// ninja
// Sample Output 2:
// false

public class CheckPalindrome {
    public static void main(String[] args) {

        String str = "racecar";
        boolean ans = checkPalindrome(str);
        System.out.println(ans);
        
    }

    public static boolean checkPalindrome(String str){
        return checkPalindrome(str,0,str.length() - 1);
    }

    public static boolean checkPalindrome(String str,int i , int j){
        if(str.length() == 0 || i >= j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return checkPalindrome(str, i + 1, j - 1);
    }
    
}
