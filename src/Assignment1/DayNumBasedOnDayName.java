package Assignment1;

import java.util.Scanner;

public class DayNumBasedOnDayName {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day name: ");
        String day = input.next();

        int dayNumber;

        switch (day.toLowerCase()) {
            case "Saturday":
                dayNumber = 1;
                break;

            case "sunday":
                dayNumber = 2;
                break;

            case "monday":
                dayNumber = 3;
                break;

            case "tuesday":
                dayNumber = 4;
                break;

            case "wednesday":
                dayNumber = 5;
                break;

            case "thursday":
                dayNumber = 6;
                break;

            case "friday":
                dayNumber = 7;
                break;

            default:
                dayNumber = -1;
        }

        if (dayNumber == -1) {
            System.out.println("Invalid day name.");
        } else {
            System.out.println("Day number: " + dayNumber);
        }
    }
}