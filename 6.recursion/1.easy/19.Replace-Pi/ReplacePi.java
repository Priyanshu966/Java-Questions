// Replace pi (recursive)

// Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
// Sample Input 1 :
// xpix
// Sample Output :
// x3.14x
// Sample Input 2 :
// pipi
// Sample Output :
// 3.143.14
// Sample Input 3 :
// pip
// Sample Output :
// 3.14p

public class ReplacePi {
    public static void main(String[] args) {
        String str = "pip";
        String ans = replacePi(str);
        System.out.println(ans);
        
    }

    public static String replacePi(String str){
        return replacePi(str, str.length() - 1);

    }

     public static String replacePi(String str, int i){
        if(i < 0){
            return "";
        }

        String ans = replacePi(str, i - 1);
        if(i < str.length() - 1 && str.charAt(i) == 'p' &&  str.charAt(i + 1) == 'i'){
            return ans += 3.14;
        }else if(i > 0 && str.charAt(i) == 'i' && str.charAt(i - 1) == 'p'){
            return ans;
        }

        return ans + str.charAt(i);
        
    }
    
}
