
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the Side length of your Square");
            int side = sc.nextInt();

            System.out.println();

            System.out.println("The Area of the square is getting calculated .....");
            double square = side * side;

            System.out.printf("The Area of the Square is: %.2f%n", square);
        }
    }
}
