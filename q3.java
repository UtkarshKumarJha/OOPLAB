class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a user-defined exception!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
