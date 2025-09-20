import java.util.Scanner;

public class prime_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Handle small cases
        if (num <= 1) {
            System.out.println("The number is not prime");
            return;
        }
        if (num == 2) {
            System.out.println("The number is prime");
            return;
        }

        boolean isPrime = true;

        // Loop only till sqrt(num) for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { 
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
