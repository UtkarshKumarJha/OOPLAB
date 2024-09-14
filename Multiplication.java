public class Multiplication {
    public static void main(String[] args) {
        int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrixB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        if (sumMatrix != null) {
            System.out.println("Sum of matrices:");
            printMatrix(sumMatrix);
        } else {
            System.out.println("Matrices cannot be added.");
        }

        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        if (productMatrix != null) {
            System.out.println("Product of matrices:");
            printMatrix(productMatrix);
        } else {
            System.out.println("Matrices cannot be multiplied.");
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                sum[i][j] = a[i][j] + b[i][j];
        return sum;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length)
            return null;
        int[][] product = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    product[i][j] += a[i][k] * b[k][j];
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}