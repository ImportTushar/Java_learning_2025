package Functionslearnings;

import java.util.Scanner;

public class functions_parameter {

    public static void calculateSum(int num1, int num2){
        
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        calculateSum(num1, num2);
    }
}
