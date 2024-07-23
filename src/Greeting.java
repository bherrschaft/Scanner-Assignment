import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("What is your name? ");

        // Read the user's name as a string
        String name = scanner.nextLine();

        // Output a greeting message with the user's name
        System.out.println("Hello, " + name + "!");

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
