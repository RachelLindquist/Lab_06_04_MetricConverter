import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Write a program that prompts the user for a measurement in meters and then converts it to miles,
        //feet, and inches. Again, check for valid input and exit with an error msg if you don’t get it.
        // Testing: use some known values here and watch for integer truncation.

        Scanner in = new Scanner(System.in);

        double meters = 0;

        String trash = ""; // use for bad input which will read as a String
        System.out.println("Please enter a measurement in meters ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            meters = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou entered " + trash + " meters");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        double miles = meters * 0.000621371192;
        double feet = meters * 3.2808399;
        double inches = meters * 39.3700787;

        System.out.println(meters + " is " + miles + " miles, " + feet + " feet, and " + inches + " inches.");

    }
}