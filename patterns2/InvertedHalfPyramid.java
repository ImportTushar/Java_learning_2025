/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class InvertedHalfPyramid {
    public static void pyramid(int n){
        //outer
        for (int i = 1; i <= n ; i ++){
            //spaces
            for(int j = 1; j <= n-i;  j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;

        pyramid(n);
    }

}
