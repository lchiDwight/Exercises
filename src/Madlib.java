import java.util.Scanner;

public class Madlib {

    public void doMadlib(){
        Scanner nounInput = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = nounInput.nextLine();

        Scanner verbInput = new Scanner(System.in);
        System.out.println("Enter a verb");
        String verb = verbInput.nextLine();

        Scanner adjectiveInput = new Scanner(System.in);
        System.out.println("Enter an adjective");
        String adjective = adjectiveInput.nextLine();

        Scanner adverbInput = new Scanner(System.in);
        System.out.println("Enter an adverb");
        String adverb = adverbInput.nextLine();

        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }

}
