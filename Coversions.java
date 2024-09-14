import java.util.Scanner;

public class Coversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        byte d = (byte) a;
        int e = (int) c;
        byte f = (byte) b;
        int g = (int) b;
        System.out.println(
                "Int to Byte: " + d + "\nChar to Int: " + e + "\nDouble to Byte: " + f + "\ndouble to int: " + g);
        sc.close();
    }
}
