/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class Largest_SmallestNumber {
    public static int getLargest(int list[]) {
        int largest = Integer.MIN_VALUE; // Start from smallest possible number

        for (int i = 0; i < list.length; i++) {
            if (largest < list[i]) {
                largest = list[i];
            }
        }
        return largest;
    }


        public static int getSmallest(int list[]) {
        int smallest = Integer.MAX_VALUE; // Start from Biggest possible number

        for (int i = 0; i < list.length; i++) {
            if (smallest > list[i]) {
                smallest = list[i];
            }
        }
        return smallest;
    }




    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ls = getLargest(list);
        int sm = getSmallest(list);
        System.out.println("The largest number is: " + ls);
        System.out.println("The smallest number is: " + sm);
    }
}

