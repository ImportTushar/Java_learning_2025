/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author TUSHAR GIRI
 */
public class IsEvenTester {


    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to test: ");
        int number = sc.nextInt();

        // Test the isEven method
        boolean result = isEven(number);

        // Display result
        if (result) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        sc.close();
    }
}
