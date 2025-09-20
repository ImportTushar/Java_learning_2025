package loopQuestionslearning;
    import java.util.Scanner;

    public class factorialfinder {
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            int factorial = 1; 

        switch (number) {
            case 0:
                System.out.println("The Factorial of 0 is 1");
                break;
            case 1:
                System.out.println("The Factorial of 1 is 1");
                break;
            default:
                int n = number;
                do { 
                    factorial *= n;
                    n--;
                } while (n > 1);
        }

            System.out.println("The factorial of number is:  " + factorial );
        }
    }
