package Lab5;

public class Complex {
    int real;
    int complex;

    Complex(int r, int c) {
        real = r;
        complex = c;
    }

    void add(int i) {
        int a = real + i;
        int b = complex;
        System.out.println(a + " + " + b + "i");
    }

    void add(Complex c2) {
        int a = real + c2.real;
        int b = complex + c2.complex;
        System.out.println(a + " + " + b + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 1);
        c1.add(5);
        c1.add(c2);

    }
}
