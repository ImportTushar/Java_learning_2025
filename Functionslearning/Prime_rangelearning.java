/**
 *
 * @author tusha
 */
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
        int start = 10;
        int end = 50;
        primeRange(start, end);
    }
}
