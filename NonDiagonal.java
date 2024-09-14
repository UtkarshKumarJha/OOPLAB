public class NonDiagonal {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;

        System.out.println("Non-principal diagonal elements: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    System.out.print(m[i][j] + " ");
                    sum += m[i][j];
                }
            }
        }
        System.out.println("\nSum of non-principal diagonal elements: " + sum);
    }
}