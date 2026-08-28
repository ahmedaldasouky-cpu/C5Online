package day3;

import java.util.Scanner;

public class Greeting {
    static Scanner Scanner = new Scanner(System.in);
   public static void main(String[] args) {

       String name = getString();
       greetUser(name);
String name2=getUserName();
       Scanner.close();

   }

    private static String getString() {
        String name = getName();
        return name;
    }

    private static String getName() {
        String name =getUserName();
        return name;
    }

    static String getUserName() {
      Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name : ");
       String name = scanner.nextLine();

       return name;
   }

      static void greetUser(String name) {
           System.out.println("Hello"+name);
       }
   }


