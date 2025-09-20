public class PrintReversenumberforloop {
    public static void main(String[] args) {
        int n = 15236;

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit+ " ");
            n = n / 10;

        }
        System.out.println();
    }
}
