import java.util.*;

class Fibonacci {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Generating Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1, next;
        
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print current term
            next = first + second; // Calculate next term
            first = second;
            second = next;
        }
    }
}
/*Enter the number of terms: 5
Fibonacci Sequence:
0 1 1 2 3
 */
