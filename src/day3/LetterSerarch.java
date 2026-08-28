package day3;
import java.util.Scanner;

public class LetterSerarch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some Text ");

boolean letterFound =false;
int position=0;
        String text =scanner.nextLine();
        for (int i=0;i<text.length();i++) {
            char currentLetter=text.charAt(i);

            if (currentLetter=='A' || currentLetter=='a'){
                letterFound =true;
                position= i+1;
                   break;
            }

        }
        if(letterFound){
            System.out.println("This text contains letter A at position "+position );
        }

        else {
            System.out.println("letter A was not found");
        }



    }

}
