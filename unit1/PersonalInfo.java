// Write a Java program to get personal information from the user
// and display it on the screen.

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("\n--- Personal Information Summary ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age + " years old");
        System.out.println("City : " + city);

        scanner.close();
    }
}