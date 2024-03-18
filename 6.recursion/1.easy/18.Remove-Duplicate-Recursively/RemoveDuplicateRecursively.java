// Remove Duplicates Recursively

// Given a string S, remove consecutive duplicates from it recursively.
// Input Format :
// String S
// Output Format :
// Output string
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string
// Sample Input 1 :
// aabccba
// Sample Output 1 :
// abcba
// Sample Input 2 :
// xxxyyyzwwzzz
// Sample Output 2 :
// xyzwz

public class RemoveDuplicateRecursively {
    public static void main(String[] args) {

        String str = "xxxyyyzwwzzz";
        String ans = removeDuplicate(str);
        System.out.println(ans);
        
    }

    public static String removeDuplicate(String str){
        return removeDuplicate(str,str.length() - 1);

    }


    public static String removeDuplicate(String str,int i){
        if(i < 0){
            return "";
        }

        String ans = removeDuplicate(str, i - 1);
        if(i < str.length() - 1){
            if(str.charAt(i) != str.charAt(i + 1)){
                return ans += str.charAt(i);
            }
        }else if(i == str.length() - 1){

            return ans += str.charAt(i);
        }

        return ans;
        


        


    }
    
}
