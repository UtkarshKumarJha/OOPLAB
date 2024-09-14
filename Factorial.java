public class Factorial{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = 1;
        for(int i=1;i<=n;i++){
            m = m*i;
        }
        System.out.print("Factorial is :");
        System.out.println(m);
    }
}