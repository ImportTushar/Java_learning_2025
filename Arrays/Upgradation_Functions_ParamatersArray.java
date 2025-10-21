/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class Upgradation_Functions_ParamatersArray {
    public static void upgrade(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        upgrade(marks);

        //print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
