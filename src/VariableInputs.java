import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string of text and read the input
        System.out.print("Enter a string of text: ");
        String text = scanner.nextLine();

        // Prompt the user to enter an integer and read the input
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        // Prompt the user to enter a double and read the input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Prompt the user to enter a boolean value and read the input
        System.out.print("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();

        // Print the user's inputs
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + doubleValue);
        System.out.println("Your boolean is " + bool);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
