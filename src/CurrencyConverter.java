import java.util.Scanner;
public class CurrencyConverter {
    public void convertCurrency(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many dollar are you exchanging?");

        double exchangeAmount = Integer.parseInt(userInput.nextLine());
        double exchangeRate = 1.22;

        double finalAmount = Math.round(exchangeAmount*exchangeRate);

        System.out.println(exchangeAmount+" dollars at an exchange rate of "+exchangeRate+" is "+finalAmount +" euros.");
    }
}
