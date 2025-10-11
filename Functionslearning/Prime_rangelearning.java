/**
 *
 * @author tusha
 */

import java.util.*;

public class Prime_rangelearning {

    public static void primeRange(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start,end;

        System.out.println("Enter The details for getting the prime number");

        System.out.print("Enter your starting number: " );
        start = sc.nextInt();

        System.out.print("Enter your Ending Number");
        end = sc.nextInt();
        primeRange(start, end);
    }
}
