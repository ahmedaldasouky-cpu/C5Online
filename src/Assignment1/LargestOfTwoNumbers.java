package Assignment1;

import java.util.Scanner;
public class LargestOfTwoNumbers {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // Question 1: Largest of two numbers
   System.out.print("Enter first number: ");
    int first = input.nextInt();
//
   System.out.print("Enter second number: ");
 int second = input.nextInt();
//
//        if (first > second) {
//            System.out.println("Largest number: " + first);
//        } else if (second > first) {
//            System.out.println("Largest number: " + second);
//        } else {
//            System.out.println("Both numbers are equal.");
//        }

        //Ternary Operator

        String result = (first > second)
                ? "Largest number: " + first
                : (second > first)
                ? "Largest number: " + second
                : "Both numbers are equal.";

        System.out.println(result);

    }

}
