package CoreJavaCoding;

public class ReverseString {

    public static void main(String[] args){

        String mainStr = "Hello World";

        // 1. for loop:
        String revStr2 = "";
        for (int i = mainStr.length() -1; i>= 0; i--) {
            revStr2 = revStr2 + mainStr.charAt(i);
        }


        // 2. StringBuilder
        StringBuilder stringBuilder = new StringBuilder(mainStr);
        String revStr = stringBuilder.reverse().toString();
        System.out.println(mainStr);
        System.out.println(revStr);
        System.out.println(revStr2);


    }
}
