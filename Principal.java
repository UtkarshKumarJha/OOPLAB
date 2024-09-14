public class Principal {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        System.out.println("Principal diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }
        System.out.println("\nSum of principal diagonal elements: " + sum);
    }
}
