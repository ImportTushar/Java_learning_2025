package Functionslearnings;

import java.util.Scanner;
public class FunctionSyntax {
    public static int PrintHelloworld(){
    System.out.println("Hello, World!");
    return 0; // Returning 0 as a result of the function execution.  // Function does not return a value by default.  // If a function does not return a value, it is considered as void.  // If a function does not return a value, the return type should be void.  // In Java, function overloading is not supported.  // Function overloading is when a class has multiple methods with the same name but different parameters.  // Function overloading
}

    public static void summing(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        PrintHelloworld();

        System.out.println();
        summing();
    }
}
