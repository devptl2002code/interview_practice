package CoreJavaCoding;

public class FactorialNum {

    // recursive
    public static long factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // using for loop
    public static long factorialUsingLoop(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    // using recursive method
    public static void main (String[] args){
        int num = 5;
        long result = factorialUsingLoop(num);
        System.out.println("Factorial of " + num + " is : " + result);
    }
}
