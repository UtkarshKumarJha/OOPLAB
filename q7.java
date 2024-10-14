import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Cannot compute the square root of a negative number!");
        } else {
            double root = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + root);
        }
    }
}
