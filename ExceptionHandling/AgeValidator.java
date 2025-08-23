package ExceptionHandling;

/* This class demonstrates two primary ways to handle a custom checked exception
 * for age validation, which is a common interview topic.
 */
public class AgeValidator {


    /**
     * A custom checked exception for cases where the age is invalid.
     * Since it extends `Exception`, it is a checked exception and must be
     * either handled or declared with 'throws'.
     */
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }


    // --- Scenario 1: Using 'throws' keyword ---
    // The method delegates the exception handling to its caller.


    /**
     * Validates an age and declares with the 'throws' keyword that it may
     * throw an InvalidAgeException. The responsibility to handle this
     * exception is passed to any method that calls this one.
     *
     * @param age The age to validate.
     * @throws InvalidAgeException if the age is less than 0 or greater than 150.
     */
    public static void validateAgeWithThrows(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            // The 'throw' keyword is used here to create and raise the exception.
            // Execution of this method stops here.
            throw new InvalidAgeException("Age " + age + " is not valid.");
        }
        System.out.println("validateAgeWithThrows: Age " + age + " is valid.");
    }


    // --- Scenario 2: Handling exception internally (without 'throws') ---
    // The method handles the exception itself, so the caller doesn't need to.


    /**
     * Validates an age and handles any exceptions internally using a 'try-catch' block.
     * Because the exception is caught and handled within this method,
     * its signature does not need to declare 'throws InvalidAgeException'.
     *
     * @param age The age to validate.
     */
    public static void validateAgeWithoutThrows(int age) {
        try {
            if (age < 0 || age > 150) {
                // The exception is thrown within the try block.
                throw new InvalidAgeException("Age " + age + " is not valid.");
            }
            System.out.println("validateAgeWithoutThrows: Age " + age + " is valid.");
        } catch (InvalidAgeException e) {
            // The catch block gracefully handles the exception.
            System.err.println("validateAgeWithoutThrows: Caught an exception: " + e.getMessage());
        }
    }


    /**
     * The main method to demonstrate how to call the two validation methods.
     */
    public static void main(String[] args) {
        System.out.println("--- Demo for validateAgeWithThrows (requires try-catch) ---");
        try {
            validateAgeWithThrows(30);   // Valid age
            validateAgeWithThrows(-5);   // Invalid age
        } catch (InvalidAgeException e) {
            // This catch block handles the exception thrown by validateAgeWithThrows(-5).
            System.err.println("Main method caught the exception: " + e.getMessage());
        }


        System.out.println("\n--- Demo for validateAgeWithoutThrows (no try-catch needed) ---");
        validateAgeWithoutThrows(30);   // Valid age
        validateAgeWithoutThrows(-5);   // Invalid age
    }
}
