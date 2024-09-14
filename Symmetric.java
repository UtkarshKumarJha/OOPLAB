public class Symmetric {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 3, 5, 6 }
        };

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i != j) {
                    if (matrix[i][j] != matrix[j][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}