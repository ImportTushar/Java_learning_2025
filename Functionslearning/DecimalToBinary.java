
import java.net.PasswordAuthentication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class DecimalToBinary {
    public static void decToBin(int number){
        int original = number;
        int pow = 0;
        int Bin = 0;
        while (number > 0){
            int remainder = number % 2;
            Bin = Bin + (remainder * (int)Math.pow(10, pow));
            pow ++;
            number = number / 2;
        }
        System.out.println("Binary from " + original  +  " = " + Bin);
    }
    public static void main(String args[]){
        decToBin(5);
    }
}
