package Lab3;

import java.lang.Math;
import java.util.Scanner;

public class Armstong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        int y = 0;
        int z = n;
        while (z != 0) {
            z = z / 10;
            y++;
        }
        while (x > 0) {
            int k = x % 10;
            sum = sum + (int) Math.pow(k, y);
            x = x / 10;
        }
        if (sum == n) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
        sc.close();
    }
}
