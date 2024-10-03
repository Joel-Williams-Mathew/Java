public class TryCatch {

    // Method that throws an exception
    public static void riskyMethod() throws ArithmeticException {
        int result = 10 / 0; // This will cause an ArithmeticException (divide by zero)
    }

    public static void main(String[] args) {
        try {
            // Call the method that might throw an exception
            riskyMethod();
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }

        // Additional code can go here
        System.out.println("Program continues after exception handling.");
    }
}
