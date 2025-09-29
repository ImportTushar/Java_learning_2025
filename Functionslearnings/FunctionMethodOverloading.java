/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tusha
 */
public class FunctionMethodOverloading {
    public static int add(int a, int b){
        return a + b;
    }
    
    public static double add(double a, double b){
        return a + b;
    }
    
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args){
        int sum1 = add(5, 10);
        double sum2 = add(5.5, 10.5);
        int sum3 = add(5, 10, 15);
        
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}
