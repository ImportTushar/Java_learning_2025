import java.util.*;
public class whileloopquestion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = 1;

        System.out.println("Enter the range ");
        int range = sc.nextInt();

        while(number <= range){
            System.out.println( "The number is  " + number + " ");
            number ++;
        }
        System.out.println();
    }
}
