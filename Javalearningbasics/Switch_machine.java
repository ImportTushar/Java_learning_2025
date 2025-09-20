import java.util.*;

public class Switch_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for calculation");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(number1 + number2);
                break;
            case '-': System.out.println(number1 - number2);
                break;
            case '*': System.out.println(number1 * number2);
                break;
            case '/': System.out.println(number1 / number2);
                break;
            default:
                System.out.println("The Calulation part has exceeded ......");;
        }
    }
}
