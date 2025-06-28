package CoreJavaCoding;

import java.util.Scanner;

public class CheckNumPrime {

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false; // 0 and 1 is not prime number
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false; // if n is even and greater than 2, it's not prime
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // prime number like, 2,3,5,7,11,13,17 etc
        // which is not divisible by any number

        System.out.println("Enter number to check prime number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is Prime Number.");
        } else {
            System.out.println(number + " is Not Prime Number.");
        }


    }
}
