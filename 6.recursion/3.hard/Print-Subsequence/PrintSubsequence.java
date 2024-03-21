public class PrintSubsequence {
    public static void main(String[] args) {
        String str = "xyz";
        printSubsequence(str);
    }

    public static void printSubsequence(String str){
        printSubsequence(str,"");
    }

    public static void printSubsequence(String str,String outputSoFar){
        if(str.length() <= 0){
            System.out.println(outputSoFar);
            return;
        }

        printSubsequence(str.substring(1), outputSoFar);
        printSubsequence(str.substring(1), outputSoFar + str.charAt(0));
    }
    
}
