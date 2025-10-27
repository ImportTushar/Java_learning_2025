/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class SUBArray2 {
    public static void SubArray(int list[]) {
        int ts = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < list.length; i++) {
            int start = i;

            for (int j = i; j < list.length; j++) {

                int end = j;
                int sum = 0;

                System.out.print("Subarray (" + start + " to " + end + "): ");

                for (int k = start; k <= end; k++) {
                    System.out.print(list[k] + " ");
                    sum += list[k];
                }

                //update the min and max
                if (sum < minSum){
                    minSum = sum;
                }

                if (sum > maxSum){
                    maxSum = sum;
                }

                ts++;
                System.out.println("=> Sum = " + sum);

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SubArray(list);
    }
}
