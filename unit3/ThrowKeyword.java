//Write a java program to use Throw Keyword 
class ThrowKeyword {
    public static void main(String args[]) {
        try {
            throw new ArithmeticException("Custom Exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}