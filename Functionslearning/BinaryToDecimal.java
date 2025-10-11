import java.util.Scanner;

/**
 * @author TUSHAR GIRI
 */
public class BinaryToDecimal {

    public static void binToDec(int number) {
        int originalNumber = number; // Preserve the original input
        int pow = 0;
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number. Only 0 and 1 are allowed.");
                return;
            }
            
            sum += lastDigit * Math.pow(2, pow);
            pow++;
            number /= 10;
        }

        System.out.println("Decimal of the binary number " + originalNumber + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number (only digits 0 and 1): ");
        int binaryInput = sc.nextInt();
        binToDec(binaryInput);
    }
}