import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HandingExceptionsExercises {
    public static void main(String[] args) {
        /*exercise1();
        exercise2();
        exercise3();

         */
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        String userInputFileName = "test-file.txt";
        try {
            Files.readString(Path.of(userInputFileName));
        } catch (IOException e) {
            System.err.println("the file could not be found");
            throw new RuntimeException(e);
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (Exception e) {
            System.err.println(" the input was not a valid integer");
            throw new RuntimeException(e);
        }
    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        try{
            System.out.println(num1/Double.parseDouble(num2AsString));
        }catch (NumberFormatException NumberFormatException){
            System.err.println("You cannot divide a number with a String");
            NumberFormatException.printStackTrace();
        }catch (ArithmeticException DivideByZeroException){
            System.err.println("You cannot divide with 0");
            DivideByZeroException.printStackTrace();
        }

    }
}