class ArrayOverflowExceptionExample {
    public static void main(String[] args) {
        int arraySize = 5; // Change this value for testing
        int[] array = new int[arraySize];

        try {
            for (int i = 0; i <= arraySize; i++) { // Intentional overflow
                array[i] = i + 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array overflow! Attempted to access an index outside the array bounds.");
        }
    }
}
