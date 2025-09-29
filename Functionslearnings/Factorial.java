/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Functionslearnings;

/**
 *
 * @author tusha
 */
public class Factorial{
    public static void Factoriallearning(int n) {
        int Factorial = 1;
        for (int i = 0; i < 10; i++) {
            Factorial *= i;
            System.out.println("Factorial of " + i + " is " + Factorial);
        }

        return Factorial;
    }


    public static void main(String[] args) {
        
    }
}
