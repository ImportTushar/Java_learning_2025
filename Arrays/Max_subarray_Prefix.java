/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class Max_subarray_Prefix {
    
    public static void MaxSubarray(int list[]) {
        int n = list.length;
        int prefix[] = new int[n];

        // ✅ Build prefix array
        prefix[0] = list[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + list[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // ✅ Check every subarray sum using prefix differences
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                
                int currentSum;
                if(start == 0) {
                    currentSum = prefix[end];
                } else {
                    currentSum = prefix[end] - prefix[start - 1];
                }

                // Update maximum found so far
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int list[] = {1, -2, 6, -1, 3};
        MaxSubarray(list);
    }
}

