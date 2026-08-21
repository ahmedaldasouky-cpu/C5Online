package Assignment1;

import java.util.Scanner;

public class SmallestOfTwoNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 2: Smallest of three numbers
        System.out.print("Enter the first num: ");
        int a = input.nextInt();

        System.out.print("Enter the second num: ");
        int b = input.nextInt();

        System.out.print("Enter the third num: ");
        int c = input.nextInt();

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Smallest number: " + smallest);
    }
}