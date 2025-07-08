package CoreJavaCoding;

import java.util.HashMap;

public class FindNonRepeatCharFromString {

    public static Character fistNonReapeatingChar(String input){

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch: input.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) +1);
        }

        for (char ch: input.toCharArray()){
            if (charCount.get(ch) == 1){
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String inputStr = "aabdccdbe";

        System.out.println(fistNonReapeatingChar(inputStr));
    }
}
