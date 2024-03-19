// Remove X

// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string S. 
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
// Sample Input 3 :
// xx
// Sample Output 3:

public class RemoveX {
    public static void main(String[] args) {
        String str = "xaxb";
        String ans = replaceX(str);
        System.out.println(ans);
        
    }

    public static String replaceX(String str){
        return replaceX(str,str.length() - 1);
    }

    public static String replaceX(String str,int i){
        if(i < 0){
            return "";
        }

        String ans = replaceX(str,i - 1);
        if(str.charAt(i) != 'x'){
            return ans += str.charAt(i);
        }

        return ans;
    }
    
}
