public class Area{
    public static void main(String[] args){
        int l;
        int b;

        l = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        int area = l*b;
        int cir = 2*(l*b);
        System.out.print("Area of the circle: ");
        System.out.println(area);
        System.out.print("Circumference of the circle: ");
        System.out.println(cir);

    }
}