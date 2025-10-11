/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class HollowRect {

    public static void HollowRectangle(int totRows, int totCols) {
        // outer loop for rows
        for (int i = 1; i <= totRows; i++) {
            // inner loop for columns
            for (int j = 1; j <= totCols; j++) {
                // cell (i, j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    // hollow space inside
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to the next line after each row
        }
    }

    public static void main(String[] args) {
        HollowRectangle(4, 10
        );
    }
}
