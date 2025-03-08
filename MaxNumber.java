import java.util.*;

class MaxNumber {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking three numbers as input    
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

      
        int max = findMax(num1, num2, num3);

        // Displaying the result
        System.out.println("The maximum number is: " + max);
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
/*
 Enter three numbers: 
2
4
6
The maximum number is: 6
 */