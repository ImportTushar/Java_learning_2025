/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author TUSHAR GIRI
 */
public class grade {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        System.out.println("Enter your Physics Marks: ");
        marks[0] = sc.nextInt();

        System.out.println("Enter your Chemistry Marks: ");
        marks[1] = sc.nextInt();

        System.out.println("Enter your Maths Marks: ");
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0] );
        System.out.println("chem : " + marks[1] );
        System.out.println("Maths : " + marks[2] );

    }
}
