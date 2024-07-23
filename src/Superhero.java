import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Print the initial lines of the story
        System.out.println("Let's write a story about a superhero.");

        // Prompt the user to enter the hero's name and read the input
        System.out.print("Who is the hero of our story? ");
        String heroName = scanner.nextLine();

        // Prompt the user to enter the hero's superpower and read the input
        System.out.print("What is their superpower? ");
        String superpower = scanner.nextLine();

        // Print the story using the user's inputs
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superpower + " to save the world.");

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
