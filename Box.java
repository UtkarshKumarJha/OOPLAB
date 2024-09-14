package Lab5;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.println(box.volume());
    }
}
