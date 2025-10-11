
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class ComputeThreeNumber {
    public static int ComThreeNum( int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second number ");
        int num2 = sc.nextInt();

        System.out.print("Enter the Third number ");
        int num3 = sc.nextInt();
        int avg = ComThreeNum(num1, num2, num3);

        System.out.println("The Average is " +avg );
    }
}
