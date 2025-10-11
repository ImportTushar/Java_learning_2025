/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class EvenOddPyramidPattern {
    public static void pyramid(int n){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j ++){
                    if((i + j) % 2 == 0){
                        System.out.print(" 1 ");
                    }
                    else {
                        System.out.print(" 0 ");
                    }
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        int  n = 5;
        pyramid(n);
    }
}
