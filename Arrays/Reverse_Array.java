/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class Reverse_Array {
    public static void ReversingArray(int list[]){
        int first = 0, last = list.length-1;

        while(first < last){
            int temp = list[last];  //swap

            list[last] = list[first];
            list[first] = temp;

            first ++;
            last --;
        }

    }
    public static void main(String[] args) {
        int list[] = {1,2,3,4,5,6,7,8,9,10};

        ReversingArray(list);
        for(int i = 0;i < list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
