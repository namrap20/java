//Write a java program to use Finally block in Exception Handling 
public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int data = 25 / 5; // Change to 25 / 0 to see exception behavior
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block: This always executes.");
        }

        System.out.println("Program continues...");
    }
}