import java.util.*;
public class IForElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult: drive, vote");
        }

        else if( age > 13 && age < 18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Not Adult");
        }
    }
}
