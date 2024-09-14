public class AutoboxingUnboxingDemo {

    public static class WrapperDemo {
        public static void displayValues() {

            int primitiveInt = 10;
            Integer wrapperInt = primitiveInt;

            double primitiveDouble = 20.5;
            Double wrapperDouble = primitiveDouble;

            char primitiveChar = 'A';
            Character wrapperChar = primitiveChar;

            boolean primitiveBool = true;
            Boolean wrapperBool = primitiveBool;

            // Display autoboxed values
            System.out.println("Autoboxed values:");
            System.out.println("Integer: " + wrapperInt);
            System.out.println("Double: " + wrapperDouble);
            System.out.println("Character: " + wrapperChar);
            System.out.println("Boolean: " + wrapperBool);

            int unboxedInt = wrapperInt; 
            double unboxedDouble = wrapperDouble; 
            char unboxedChar = wrapperChar;
            boolean unboxedBool = wrapperBool; 


            System.out.println("\nUnboxed values:");
            System.out.println("int: " + unboxedInt);
            System.out.println("double: " + unboxedDouble);
            System.out.println("char: " + unboxedChar);
            System.out.println("boolean: " + unboxedBool);
        }
    }

    public static void main(String[] args) {

        WrapperDemo.displayValues();
    }
}
