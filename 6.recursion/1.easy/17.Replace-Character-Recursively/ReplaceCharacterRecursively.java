// Replace Character Recursively

// Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
// Do this recursively.
// Input Format :
// Line 1 : Input String S
// Line 2 : Character c1 and c2 (separated by space)
// Output Format :
// Updated string
// Constraints :
// 1 <= Length of String S <= 10^6
// Sample Input :
// abacd
// a x
// Sample Output :
// xbxcd

public class ReplaceCharacterRecursively {
    public static void main(String[] args) {

        String str = "abacd";
        char firstChar = 'a';
        char secChar = 'x';

        String ans = replaceChar(str,firstChar,secChar);
        System.out.println(ans);
    }

    public static String replaceChar(String str, char firstChar, char secChar){
        return replaceChar(str, firstChar, secChar, str.length() - 1);
    }

    public static String replaceChar(String str, char firstChar, char secChar,int i){
        if(i < 0){
            return "";
        }
        String ans = replaceChar(str, firstChar, secChar, i - 1);

        if(str.charAt(i) != firstChar){
            return ans += str.charAt(i);
        }else if(str.charAt(i) == firstChar){
            return ans += secChar;
        }

        return ans;


    }
    
}
