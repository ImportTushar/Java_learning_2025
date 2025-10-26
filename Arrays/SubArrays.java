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
    public static void SubArrays(int list[],int start,int end){
        
        if(start < 0 || end < 0 || start >= list.length || end >= list.length){
            System.out.println("Invalid inputs please rewrite the numbers again" + (list.length - 1));
            return;
        }



        //Ensure the start < end one;
        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }


        //print all Subarrays

        for(int  i = start; i <= end; i++) {
            for( int j = i ; j <= end; j++){
                System.out.print("["); //brackers

                for(int k = i ; k <= j; k++) {
                    System.out.print(list[k]);

                    if(k < j){
                        System.out.print(", ");
                    }
                }

                System.out.print("] ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int list[] = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.print("Enter your Start: ");
        int start = sc.nextInt();

        System.out.print("Enter your end: ");
        int end = sc.nextInt();

        SubArrays(list, start, end);
    }
}
