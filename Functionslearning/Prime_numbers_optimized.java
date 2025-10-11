/*
 * Click nbfs://nbfs/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbfs/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tusha
 */
public class Prime_numbers_optimized {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return false; // Found a divisor, not prime
            }
        }
        System.out.println(number + " is a prime number.");
        return true; // No divisors found, it's prime
    }   

    public static void main(String[] args) {
        int number = 29; // Example number to check
        isPrime(number);
    }
}
