public class As {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {

            if (i < 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("*");
                }
            }
            if (i >= 4) {
                for (int j = 0; j < 7 - i; j++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}