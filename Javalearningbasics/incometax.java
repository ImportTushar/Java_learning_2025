import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income ....");
        float income = sc.nextFloat();

        float tax;

        if(income<5.0f){
            System.out.println("You are not elgiible for tax");
        }   

        else if (income>5.0f && income <= 10.0f) {
            tax = (float)(income * 0.2f);
            System.out.println("Your Tax is " + tax);
        }

        else{
            tax = (float)(income * 0.5f);
            System.out.println("Your Tax is " + tax);
        }
    }
}
