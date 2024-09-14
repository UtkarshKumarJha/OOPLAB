import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char response;

        do {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the operator (+, -, *, /): ");
            char op = sc.next().charAt(0);
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            switch (op) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Error: Division by zero is not allowed.");
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }

            System.out.print("Do you want to do another calculation? (y/n): ");
            response = sc.next().charAt(0);
        } while (response == 'y');
        sc.close();

    }
}
