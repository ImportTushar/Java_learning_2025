public class print_largestnumber {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = 3;

        if (a >= b && a >= c){
            System.out.println("the largest number is a");
        }
        else if (b>=a && b>=c) {
            System.out.println("The largest number is b");
        }
        else {
            System.out.println("The largest number is c");
        }
    }
}
