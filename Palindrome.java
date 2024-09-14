public class Palindrome{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = 0;
        int x = n;
        while(x>0){
            m = (m*10) + (x%10);
            x = x/10;
        }
        if(m==n){
            System.out.println("It is a palindrome!");
        }else System.out.println("It is not a palindrome!");
    }
}