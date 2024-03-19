// Pair star

// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// Input format :
// String S
// Output format :
// Modified string
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// hello
// Sample Output 1:
// hel*lo
// Sample Input 2 :
// aaaa
// Sample Output 2 :
// a*a*a*a

public class PairStar {
    public static void main(String[] args) {
        String str = "hello";
        String ans = pairStar(str);
        System.out.println(ans);

        
    }

    //Method one
    // public static String pairStar(String str){
    //     return pairStar(str,str.length() - 1);
    // }
    // public static String pairStar(String str,int i ){
    //     if(i < 0){
    //         return "";
    //     }

    //     String ans = pairStar(str, i - 1);

    //     if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
    //         return ans + str.charAt(i) + '*';
    //     }
    //     return ans + str.charAt(i);
    // }

    //Method two
    // public static String pairStar(String str){
    //     if(str.length() <= 0){
    //         return "";
    //     }

    //     String ans = pairStar(str.substring(1));

    //     if(str.length() > 1 && str.charAt(0) == str.charAt(1)){
    //         return ans = str.charAt(0) + "*" + ans;
    //     }else{
    //         return ans = str.charAt(0) + ans;

    //     }
        
    // }


    //Method three
    public static String pairStar(String str){
        if(str.length() <= 1){
            return str;
        }

        String ans = pairStar(str.substring(1));

        if(str.charAt(0) == str.charAt(1)){
            ans = str.charAt(0) + "*" + ans;
        }else{
            ans = str.charAt(0) + ans;
        }

        return ans;
    }
    
}
