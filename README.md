# built-in-function
Date and Time in Java
Java provides built-in functionality to handle date and time effectively.

1. Legacy Date and Time API (Before Java 8)

Classes: java.util.Date and java.util.Calendar
Issues: Mutable, not thread-safe, lacks proper timezone handling.
2. Modern Java Date and Time API (Java 8 onwards)

Introduced: java.time package
Improvements:
Immutability and thread safety
Clear separation of date and time
Better support for formatting and parsing
3. Key Classes in java.time Package

LocalDate: Represents date without time & timezone. (Example: LocalDate.now())
LocalTime: Represents time without date & timezone. (Example: LocalTime.now())
LocalDateTime: Represents date and time without timezone. (Example: LocalDateTime.now())
ZonedDateTime: Includes date, time, and timezone. (Example: ZonedDateTime.now())
4. Date-Time Operations

Parsing & Formatting: DateTimeFormatter for conversion between Strings and date objects.
Arithmetic Operations: plusDays(), minusMonths(), etc., for adding or subtracting time.
Comparison: isBefore(), isAfter(), isEqual() to compare dates.
Time Differences: ChronoUnit to calculate time differences in days, months, or years.
5. Thread-Safety & Immutability

java.time classes are immutable, making them thread-safe.
Java Common Built-in Functions: Random, Math, and Utility Methods
1. Random Number Generation

java.util.Random
Math.random() (generates a double between 0.0 and 1.0)
2. Mathematical Functions (Math class)

Math.abs(x): Absolute value
Math.pow(x, y): Power function
Math.sqrt(x): Square root
3. String Manipulation

length(): Get string length
substring(): Extract part of a string
toUpperCase(), toLowerCase(): Change case
4. Array Utilities (java.util.Arrays class)

Arrays.toString(arr): Convert array to string
Arrays.sort(arr): Sort an array
Arrays.binarySearch(arr, key): Perform binary search in a sorted array
