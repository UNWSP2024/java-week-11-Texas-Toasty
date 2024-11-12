package Week11;

import java.util.Scanner;

public class ComputerMenu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n     Welcome to the Ultimate Computer!");
            System.out.println("               Main Menu");
            System.out.println("-".repeat(40));
            System.out.println("1: Display a motivational message");
            System.out.println("2: Show ASCII art");
            System.out.println("3: Calculator");
            System.out.println("4: Binary Calculator");
            System.out.println("5: Encouragement");
            System.out.println("6: Roll Dice");
            System.out.println("7: Translate to Oppish");
            System.out.println("8: Generate Fibonacci Sequence");
            System.out.println("9: Calulate Double Factorial");
            System.out.println("10: Exit");
            System.out.print("Choose an option (1-10): ");

            int choice = getValidChoice(scanner);

            // Main menu selection logic
            switch (choice) {
                case 1 -> display(null);
                case 2 -> art(null);
                case 3 -> calculator(null);
                case 4 -> binaryCalculator(null);
                case 5 -> encouragement(null);
                case 6 -> Dice(null);
                case 7 -> runOppish(null);
                case 8 -> fibonacci(null);
                case 9 -> doubleFactorial(null);
                case 10 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    keepRunning = false;
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        }
        
        scanner.close();
    }
    
    // Method to get a valid integer choice from user input
    private static int getValidChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 10) {
                    return choice;
                } else {
                    System.out.print("Please enter a valid option (1-10): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number between 1 and 10: ");
            }
        }
    }

    // Placeholder methods for menu options (can be filled later)
    public static void display(String[] args) {
        System.out.println("Displaying a motivational message...");
        
    }

    public static void art(String[] args) {
        System.out.println("Showing ASCII art...");
        
    }

    public static void calculator(String[] args) {
        System.out.println("Opening calculator...");
        // TODO: Implement the calculator functionality
    }

    public static void binaryCalculator(String[] args) {
        System.out.println("Opening binary calculator...");
        // TODO: Implement the binary calculator functionality
    }

    public static void encouragement(String[] args) {
        System.out.println("Providing encouragement...");
        // TODO: Implement the encouragement functionality
    }

    public static void Dice(String[] args) {
        System.out.println("Rolling dice...");
        // TODO: Implement the dice rolling functionality
    }

    public static void runOppish(String[] args) {
        System.out.println("Translating to Oppish...");
        // TODO: Implement Oppish translation functionality
    }

    public static void fibonacci(String[] args) {
        System.out.println("Generating Fibonacci sequence...");
        // TODO: Implement Fibonacci sequence generation
    }
    public static void doubleFactorial(String[] args) {
        System.out.println("Generating Fibonacci sequence...");
        // TODO: Implement Double Factorial sequence generation
    }
}