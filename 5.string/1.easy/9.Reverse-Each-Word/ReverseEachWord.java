// Reverse Each Word

// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
// Example:
// Input Sentence: "Hello, I am Aadil!"
// The expected output will print, ",olleH I ma !lidaA".
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
// Output Format:
// The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// Dream is just a reality
// Sample Output 1:
// maerD si tsuj a ytilaer
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// syawlA tnedni ruoy edoc

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Always indent your code";

        String output = "";
        String word = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                output += word + " ";
                word = "";
                continue;
            }
            word = str.charAt(i) + word;

            if(i == str.length() - 1){
                output += word;
            }


        }

        System.out.println(output);
        
    }
    
}
