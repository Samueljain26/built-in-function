import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two date inputs from the user
        System.out.println("Enter first date (yyyy-MM-dd): ");
        String date1 = sc.nextLine();
        System.out.println("Enter second date (yyyy-MM-dd): ");
        String date2 = sc.nextLine();

        // Convert input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        // Compare dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
/*Enter first date (yyyy-MM-dd): 
2025-03-26
Enter second date (yyyy-MM-dd): 
2023-05-23
The first date is after the second date.
 */