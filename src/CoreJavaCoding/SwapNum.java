package CoreJavaCoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapNum {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // using 3rd var
        System.out.println("Before swap: a= " + a + " and b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a= " + a + " and b= " + b);



        // without using 3rd var
        System.out.println("Before swap: a= " + a + " and b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a= " + a + " and b= " + b);



        // using inbuilt method

        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        System.out.println("Before swap: " + numbers);
        Collections.swap(numbers, 0, 1);
        System.out.println("After swap: " + numbers);

    }
}
