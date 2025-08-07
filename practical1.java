public class practical1 {

    public static boolean isPalindrome1(String word){
        for(int i = 0; i<word.length(); i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String word){
        int counter = 0;
        while(counter < word.length()){
            if (word.charAt(counter) != word.charAt(word.length()-counter-1)) {
                return false;
            }
            counter++;
        }
        return true;
    }

    public static boolean isPalindrome3(String word){
        if (word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
        if (word.length() <=2){
            return true;
        }
        word = word.substring(1, word.length()-1);
        isPalindrome3(word);
        return true;
    }

    static boolean firstLast(String word){
        if (word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
        return true;
    }

    public static boolean isPalindrome4(String word){
        if (!firstLast(word)){
            return false;
        }
        if (word.length() <=2){
            return true;
        }
        word = word.substring(1, word.length()-1);
        isPalindrome3(word);
        return true;
    }




    public static void main(String[] args) {
        String x = "AA";
        System.out.println(isPalindrome1(x));
        System.out.println(isPalindrome2(x));
        System.out.println(isPalindrome3(x));
        System.out.println(isPalindrome4(x));
    }
}

