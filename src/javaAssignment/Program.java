package javaAssignment;

import java.util.Scanner;

public class Program {

    /**
     * Prints the numbers starting from 10 and going down to 1.
     */
    public static void printNumbersDescending() {
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }
    }

    /**
     * Displays numbers from 1 to 10 and identifies each number
     * as either even or odd.
     */
    public static void printEvenOrOdd() {
        for (int number = 1; number <= 10; number++) {

            if (number % 2 == 0) {
                System.out.println(number + " -> Even");
            } else {
                System.out.println(number + " -> Odd");
            }
        }
    }

    /**
     *Determines whether the given number is positive, negative, or zero.
     *
     * @param number the integer that needs to be checked
     * @return "Positive", "Negative", or "Zero" depending on the number
     */
    public static String checkNumberType(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two integer values together and gives back their total.
     *
     * @param number1 the first number used in the calculation
     * @param number2 the second number used in the calculation
     * @return the sum of number1 and number2
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Runs the Number Analyzer menu and handles the user's selections.
     *
     * @param args command-line arguments provided when the program starts
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();

                    String result = checkNumberType(number);

                    System.out.println(result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = scanner.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = scanner.nextInt();

                    int sum = calculateSum(number1, number2);

                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        scanner.close();
    }
}