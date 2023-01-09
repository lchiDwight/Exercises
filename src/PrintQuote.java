import java.util.Scanner;

public class PrintQuote {
    public static void printQuote(){

        Scanner userInputQuote = new Scanner(System.in);

        System.out.println("What is the quote?");

        String quote = userInputQuote.nextLine();

        Scanner userInputAuthor = new Scanner(System.in);

        System.out.println("Who said it?");

        String author = userInputAuthor.nextLine();

        System.out.println(author + " says, "+ "\""+quote + "\"");

    }
}
