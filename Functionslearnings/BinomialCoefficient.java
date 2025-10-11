/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tusha
 */
public class BinomialCoefficient {
    
    public static int factorial(int n, int r){
        int n_factorial = 1;
        for(int i=1; i<=n; i++){
            n_factorial = n_factorial * i;
        }

        int r_factorial = 1;
        for(int i = 1; i <= r; i ++){
            r_factorial = r_factorial * i;
        }

        return n_factorial;
    }
    
    public static void main(String[] args){
        int n = 5;
        int r = 2;
        int n_factorial = factorial(n, r);
        int r_factorial = factorial(r, r);
        int n_r_factorial = factorial(n - r, r);
        
        int binomialCoefficient = n_factorial / (r_factorial * n_r_factorial);
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + binomialCoefficient);
    }
}
