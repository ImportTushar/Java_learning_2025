/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Functionslearnings;

/**
 *
 * @author tushar
 */
public class productusinglearning {
    public static int multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);

        return product; // returning the product from the method
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        int product = multiply(a,b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }
}
