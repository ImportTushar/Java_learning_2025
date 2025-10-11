/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class rhombus {

    public static void Pattern(int n){
        //outer
        for(int i = 1 ; i <=n; i ++){
            //Space 
            for(int j = 1 ; j <= n - i; j ++){
                System.out.print("  ");
            }

            //for stars
            for(int j = 1 ; j <= n; j++){
                if( i == 1 ||  i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int  n = 5;
        Pattern(n);
    }
}
