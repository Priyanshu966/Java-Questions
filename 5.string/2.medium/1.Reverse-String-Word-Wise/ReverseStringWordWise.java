// Reverse String Word Wise

// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format 
// String in a single line
// Output format 
// Word wise reversed string in a single line
// Constraints 
// 0 = S = 10^7
// where S represents the length of string, S.
// Sample Input 1
// He forgot to do his work
// Sample Output 1
// work his do to forgot He
// Sample Input 2
// Always indent your code
// Sample Output 2
// code your indent Always


public class ReverseStringWordWise {
    public static void main(String[] args) {
        String str = "Always indent your code";
        String newStr = "";

        int startIndex = 0;
        int endIndex;
        boolean toggle = true;
    
        for(int i = 0; i < str.length(); i++){
            if(toggle == true && str.charAt(i) != ' ' ){
                startIndex = i;
                toggle = false;
            }
            if(!toggle && (str.charAt(i) == ' ' || i + 1 == str.length())){
                endIndex = i + 1;
                toggle = true;
                if(i + 1 == str.length()){
                newStr = str.substring(startIndex,endIndex) + " " + newStr;
                }else{
                    newStr = str.substring(startIndex,endIndex) + newStr;
                }
            }
            

        }
        System.out.println(newStr);
        
    }
    
}
