package Variable;

import java.util.*;

public class Question {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Write your first number");
            int a = sc.nextInt();
            System.out.println("You entered: " + a);

            System.out.println("Write your Second number");
            int b = sc.nextInt();
            System.out.println("you entered: " + b);

            System.out.println("Write your third number");
            int c = sc.nextInt();
            System.out.println("you entered: " + c);

            int sum = a + b + c;
            System.out.println("The Sum of your provided numbers are: " + sum);

            System.out.println("Checking for the Average of your 3 numbers");
            double avg = sum / 3.0;  // ensures decimal division
            System.out.printf("The Average of your numbers is: %.2f%n", avg);
        }
    }
}
