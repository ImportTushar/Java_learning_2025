package Nestedloop;

    public class invertedstarpattern {
        public static void main(String[] args) {
            int i, j, n = 4;
            for (i = 1; i <= 4; i++) {
                for (j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
