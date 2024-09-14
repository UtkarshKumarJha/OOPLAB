package Lab3;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("Element found at : " );
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print(i + 1 + " ");
            }
        }
        sc.close();
    }
}
