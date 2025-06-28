package CoreJavaCoding;

import java.util.Scanner;

public class PrintFibonacciSeries {

    static void generateFibonacci(int n){

        if (n <= 0) {
            System.out.println("Limit must be positive");
        }

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit for fibonacci series: ");
        int limit = sc.nextInt();

        System.out.println("Fibbonacci Series till " + limit + " is: ");
        generateFibonacci(limit);
    }
}
