import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */

public class SubArrays {
    public static void SubArrays(int list[], int startVal, int endVal) {

        int start = -1, end = -1;

        // Find the indices of the numbers in the list
        for (int i = 0; i < list.length; i++) {
            if (list[i] == startVal) start = i;
            if (list[i] == endVal) end = i;
        }

        // Check if both numbers exist in the list
        if (start == -1 || end == -1) {
            System.out.println("Invalid input! One or both numbers are not in the list.");
            return;
        }

        // Ensure start < end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Print the subarray in one line
        for (int i = start; i <= end; i++) {
            System.out.print(list[i]);
            if (i < end) System.out.print(".");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        SubArrays(list, num1, num2);
    }
}

