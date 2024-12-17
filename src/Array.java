import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
         * Create and reverse an array of integers
         *
         * - declares an integer array of size 5
         * - allows the user to input values for each position in the array
         * - prints the values of the array in reverse order
         */

        // Your code here:
        int[] array = new int [5];

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter 5 int");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for position " + (i + 1) + ": ");
            array[i] = keyboard.nextInt();
}
    }
        }