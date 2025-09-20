package Functionslearnings;

public class callbyvalue {
    public static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        swapNumbers(a, b);

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    //Output: Before swapping: a = 5, b = 10
    // Call by value creates a copy of the original variables in the function, thats why changes made inside the function do not affect the original variables outside the function.
}
