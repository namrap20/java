// Write a Java program to get different values from the user at runtime using Scanner.

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA or salary: ");
        double financialValue = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nUSER PROFILE SUMMARY");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Value: " + financialValue);
        System.out.println("Is Student? " + isStudent);

        scanner.close();
    }
}