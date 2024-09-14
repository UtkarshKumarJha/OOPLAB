import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Divide by 2 using right shift operator
        int divided = number >> 1;
        System.out.println(number + " divided by 2 is " + divided);
        sc.close();
    }
}
