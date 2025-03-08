import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!guessedCorrectly) {
            int guess = generateRandomGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'): ");
            String response = sc.next().toLowerCase();

            // Process user feedback
            if (response.equals("correct")) {
                System.out.println("guessed it right.");
                guessedCorrectly = true;
            } else if (response.equals("high")) {
                high = guess - 1; // Adjust the range
            } else if (response.equals("low")) {
                low = guess + 1; // Adjust the range
            } else {
                System.out.println("Invalid response! Please enter 'high', 'low', or 'correct'.");
            }
        }
        sc.close();
    }

    // Generate a random number between the given range
    public static int generateRandomGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
/*
 Think of a number between 1 and 100.
Is your number 22? (Enter 'high', 'low', or 'correct'): 
high
Is your number 21? (Enter 'high', 'low', or 'correct'): 
high
Is your number 13? (Enter 'high', 'low', or 'correct'): 
correct
guessed it right.
 */