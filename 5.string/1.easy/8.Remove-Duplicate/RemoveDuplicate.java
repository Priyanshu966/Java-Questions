public class RemoveDuplicate {
        public static void main(String[] args) {
        String str = "aaaabbsdfaaab";
        String ans = removeDuplicate(str);
        System.out.println(ans);
        
    }

    public static String removeDuplicate(String str){
        if(str.length() == 0 || str.length() == 1){
            return str;
        }

        char arr[] = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] == arr[i]){
                        arr[j] = ' ';
                    }
                }

//
            }
        }
         
        String output = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                output += arr[i];
            }
        }

        return output;
    }
}
