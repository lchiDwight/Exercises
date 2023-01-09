import java.util.Scanner;

public class TaxCalculator {

    public static void calculateTax(){
        Scanner orderInput = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double orderAmount = Double.parseDouble(orderInput.nextLine());

        Scanner stateInput = new Scanner(System.in);
        System.out.println("What is the state?");
        String state = stateInput.nextLine().toUpperCase();

        double taxRate = 0.055;
        if(state.equals("WI") || state.equals("WISCONSIN")){
            double taxAmount = orderAmount * taxRate;
            System.out.println("the subtotal is : $"+orderAmount+"\n"+"the tax is $"+taxAmount+"\n"+"The total is $"+(orderAmount+taxAmount)+" in state of "+state);
        }



    }
}
