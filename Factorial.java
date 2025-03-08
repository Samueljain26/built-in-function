import java.util.*;

class Factorial {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculating factorial using recursion
        long result = calculateFactorial(num);

        // Displaying the result
        System.out.println("Factorial of " + num + " is: " + result);
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 1)  // Base case: Factorial of 0 and 1 is 1
            return 1;
        else
            return n * calculateFactorial(n - 1);  // Recursive call
    }
}
/*
 * Enter a number: 3
Factorial of 3 is: 6
 */