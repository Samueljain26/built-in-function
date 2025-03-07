import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for a date
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Format and display the result
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Updated Date: " + newDate.format(formatter));
    }
}
/*Enter a date (yyyy-MM-dd): 
2025-03-07
Updated Date: 2027-03-24
 */