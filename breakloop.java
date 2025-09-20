public class breakloop {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("Value of i: " + i);
        }
        System.out.println("I am out of the loop........");
    }
}
