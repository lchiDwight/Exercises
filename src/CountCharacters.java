import java.util.Scanner;

public class CountCharacters {
    public void countCharacters(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the input string?");

        String inputString = userInput.nextLine();

        System.out.printf(inputString+" has "+ inputString.length() +" characters");


    }
}
