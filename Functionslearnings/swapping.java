package Functionslearnings;

    public class swapping{

        // Swapping using XOR
        public static void swapXor(int x, int y) {
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            System.out.println("After swapping using XOR: x = " + x + ", y = " + y);
        }

        // Swapping using addition/subtraction
        public static void swapAddSub(int x, int y) {
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swapping using + and -: x = " + x + ", y = " + y);
        }

        // Swapping using multiplication/division
        public static void swapMulDiv(int x, int y) {
            if (x != 0 && y != 0) {  // avoid division by zero
                x = x * y;
                y = x / y;
                x = x / y;
                System.out.println("After swapping using * and /: x = " + x + ", y = " + y);
            } else {
                System.out.println("Cannot swap using * and / (zero involved).");
            }
        }

        public static void main(String[] args) {
            int x = 10, y = 5;

            System.out.println("Before swapping: x = " + x + ", y = " + y);

            // Using temp variable
            int temp = x;
            x = y;
            y = temp;
            System.out.println("After swapping using temp variable: x = " + x + ", y = " + y);

            // XOR method
            swapXor(10, 5);

            // Add/Sub method
            swapAddSub(10, 5);

            // Mul/Div method
            swapMulDiv(10, 5);
        }
    }
