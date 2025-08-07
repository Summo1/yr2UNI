public class testing {
    public static void main(String[] args) {
        System.out.println(numberAllocation(4));
        
    }


    public static String numberAllocation(int number){
        String[] wordList = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        if (number < 1 || number > 10) {
            return "??";
        }
        return wordList[number - 1];
    }

    
}
