/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class Pair_of_Arrays {
    public static void Pairing(int list[]){
        int totalPairs = 0;
        for (int i = 0; i < list.length; i ++){
            int current = list[i];
            for (int j =i + 1; j < list.length;j++){
                System.out.print("(" + current + "," + list[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }
    public static void main(String args[]){
        int list[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Pairing(list);
    }
}
