public class MagicSquare {
    public static void main(String[] args) {
        int[][] matrix = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 }
        };

        if (isMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = sumRow(matrix, 0);

        for (int i = 1; i < n; i++) {
            if (sumRow(matrix, i) != magicSum)
                return false;
        }

        for (int i = 0; i < n; i++) {
            if (sumColumn(matrix, i) != magicSum)
                return false;
        }

        if (sumPrincipalDiagonal(matrix) != magicSum)
            return false;
        if (sumAntiDiagonal(matrix) != magicSum)
            return false;

        return true;
    }

    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int col) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        return sum;
    }

    public static int sumPrincipalDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumAntiDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
}
