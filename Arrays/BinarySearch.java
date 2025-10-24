
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUSHAR GIRI
 */
public class BinarySearch {
    public static int BinaryS(int list[],int key) {
        int start = 0, end  = list.length-1;
        while(start <= end){
            int mid = (start + end) /2;
            //comparisons
            if(list[mid] == key){
                return mid;
            }
            
            if(list[mid] < key){
                //right 

                start = mid + 1;

            }else{
                //left

                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};
        int key = 5;


        System.out.println("Index for key is: " + BinaryS(list, key));
    }
}
