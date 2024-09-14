package Lab3;

public class Pattern2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            for (int i = 1; i <= number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}