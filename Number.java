package Lab5;

public class Number {
    private double value;

    Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        return value == 0;
    }

    boolean isPositive() {
        return value > 0;
    }

    boolean isNegative() {
        return value < 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong() {
        int temp = (int) value;
        int sum = 0;
        int x = temp;
        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == value;
    }

    public static void main(String[] args) {
        Number num = new Number(153);
        System.out.println(num.isZero()); // false
        System.out.println(num.isPositive()); // true
        System.out.println(num.isNegative()); // false
        System.out.println(num.isOdd()); // true
        System.out.println(num.isEven()); // false
        System.out.println(num.isPrime());// false
        System.out.println(num.isArmstrong());// false
        System.out.println();

    }
}
