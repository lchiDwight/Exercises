import java.util.Scanner;

public class SayHello {
    public static void sayHello(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = userInput.nextLine();

        System.out.println("Hello "+userName+", nice to meet you!");
    }
}
