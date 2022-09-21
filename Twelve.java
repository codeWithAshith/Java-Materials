public class Twelve {
    public static void main(String[] args) {
        char alphabet = 'A';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
            }
            alphabet++;

            System.out.println();
        }
    }
}
