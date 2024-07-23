import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user with the first question and read their response
        System.out.print("Hello there! How are you doing today? ");
        String response1 = scanner.nextLine();

        // Prompt the user with the second question and read their response
        System.out.print("Wow - Interesting! Tell me more! ");
        String response2 = scanner.nextLine();

        // Print a goodbye message
        System.out.println("Goodbye!");

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
