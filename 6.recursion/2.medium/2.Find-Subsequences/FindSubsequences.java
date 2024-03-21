public class FindSubsequences {
    public static void main(String[] args) {
        String str = "xyz";
        String ans[] = FindSubsequences(str);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

        
    }

    public static String[] FindSubsequences(String str){
        if(str.length() <= 0){
            String arr[] = {""};
            return arr;
        }

        String ans[] = FindSubsequences(str.substring(1));
        String arr[] = new String[ans.length * 2];

        int k = 0;
        for(int i = 0; i < ans.length; i++){
            arr[k] = ans[i];
            k++;
        }

        for(int i = 0; i < ans.length; i++){
            arr[k] = str.charAt(0) + ans[i];
            k++;
        }

        return arr;

    }
    
}
