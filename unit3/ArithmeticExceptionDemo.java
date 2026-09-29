public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            // Division by zero throws ArithmeticException
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.out.println("Exception caught: Cannot divide by zero!");
        }

        System.out.println("Program continues after handling exception.");
    }
}